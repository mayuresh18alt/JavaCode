public class BinarySearch{

    public static int binarysearch(int a[],int n,int key)
    {   
        int low= 0;
        int high=n-1;
        int mid=0;

        while(low<=high)
        {
            mid=(low+high)/2;
            if(key==a[mid])
            {
                System.out.println("element found at array of index");
                 return mid;
            }
            else if(key< a[mid])
            {
                high=mid-1;
                low=low;

            }
            else
            {
                low=mid+1;
                high=high;
            }
        }
        System.out.println("element not found");
        return -1;
    }
    
    public static void main(String[] args) {

        int a[]={11,22,33,44,55,66,77,88,99,111};
        int n=a.length;
        int key=44;

        System.out.println(binarysearch(a, n, key));

        

    }
}