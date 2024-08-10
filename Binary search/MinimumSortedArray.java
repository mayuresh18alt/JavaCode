public class MinimumSortedArray {
    public static int Printminimumelement(int arr[],int n)
    {
        int low=0;
        int high=n-1;

        while (low<high)
        {
            int mid=(low+high)/2;

            if(arr[mid]>arr[high])
            {
                low=mid+1;
            }
            else 
            {
                high=mid;
            }
            
        }
        return arr[low];
    }
    public static void main(String[] args) {
        MinimumSortedArray ms=new MinimumSortedArray();

        int arr[]={4,5,6,7,0,1,2,3};
        int n=arr.length;
       

        System.out.println("minimum element is"+" "+ms.Printminimumelement(arr, n));
    }
}
