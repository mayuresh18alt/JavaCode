import java.util.ArrayList;
import java.util.Arrays;

public class Sortarray {
    public static void Printsortarray(ArrayList<Integer> arr, int n)
    {
        int cnt0=0; int cnt1=0; int cnt2=0;

        for(int i=0;i<n;i++)
        {
           if(arr.get(i)==0) cnt0++; 
           else if(arr.get(i)==1) cnt1++;
           else cnt2++;
        }
        for (int i = 0; i < cnt0; i++) arr.set(i, 0); // replacing 0's

        for (int i = cnt0; i < cnt0 + cnt1; i++) arr.set(i, 1); // replacing 1's

        for (int i = cnt0 + cnt1; i < n; i++) arr.set(i, 2);

        System.out.println("after sorting");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr.get(i)+" ");
        }
    }
        
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        int n =6;

        System.out.println("before sorting array");

        for(int i=0;i<n;i++)
        {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();

        Printsortarray(arr, n);
    }      
}
