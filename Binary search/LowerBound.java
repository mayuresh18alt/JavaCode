public class LowerBound {
    public static int lowerBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;
        
        while (low <= high)
        {
            int mid = (low + high ) / 2;
            
            if (arr[mid] == target)
            {
                return mid;
            } else if (arr[mid] < target)
            {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 5, 6, 8};
        
        int target = 4;
        System.out.println("Lower bound of " + target + " is at index: " + lowerBound(arr, target));
        
        target = 7;
        System.out.println("Lower bound of " + target + " is at index: " + lowerBound(arr, target));
    }
}
