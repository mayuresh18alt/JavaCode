public class InsertPosition {
    
    public static int Printinsertposition(int arr[],int n,int target)
    {
        int low=0;
        int high=n;

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
        
        return-1;
    }
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;

        int target=5;
        System.out.println("Insert position of " + target + " is: " +Printinsertposition(arr, n, target));

        target=3;
        System.out.println("Insert position of " + target + " is: " +Printinsertposition(arr, n, target));

        target=10;
        System.out.println("Insert position of " + target + " is: " +Printinsertposition(arr, n, target));
    }
}
