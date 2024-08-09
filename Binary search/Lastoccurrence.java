public class Lastoccurrence {

    public static int Printlastoccurrence(int arr[],int n,int x)
    {
        int low=0;
        int high=n-1;
        int result=-1;

        while (low<=high)
        {
            int mid=(low+high)/2;

            if(arr[mid]==x)
            {
                return mid;
            }
            else if(arr[mid]<x)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[]={1, 2, 2, 2, 3, 4, 5};
        int n=arr.length;
        int x=2;

        System.out.println(x+" "+" appears count is"+" "+Printlastoccurrence(arr, n, x));
    }
}
