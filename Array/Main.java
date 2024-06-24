import java.util.*;

public class Main {
    public static boolean isPossible(int[] arr, int n) {
        int cur = arr[0];
        cur--; // Decrease the first element
        for (int i = 1; i < n; i++) {
            int nxt = arr[i];
            if (nxt > cur)
                nxt--; // Decrease the current element if possible
            else if (nxt < cur)
                return false; // If current element becomes less than previous, answer is "No"
            cur = nxt;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3};
        int n = arr.length;
        if (isPossible(arr, n))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
