public class RotatedArraySearch {

    public static int search(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x)
            {
                return mid;
            }

            if (arr[low] <= arr[mid]) // Left half is sorted
            {  
                if (arr[low] <= x && x < arr[mid])
                {
                    high = mid - 1;  
                } else
                {
                    low = mid + 1;  
                }
            } 
            else
            {  
                if (arr[mid] < x && x <= arr[high]) // Right half is sorted
                {
                    low = mid + 1;  
                } else {
                    high = mid - 1;  
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = search(arr, target);

        if (result != -1) {
            System.out.println("Target " + target + " found at index " + result);
        } else {
            System.out.println("Target " + target + " not found in the array");
        }
    }
}
