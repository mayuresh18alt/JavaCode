public class FlorandCeil {
    
        public static int Printfloor(int arr[],int n,int x)
        {
            int low=0;
            int high=n-1;
            int floor=-1;

            while(low<=high)
            {
                int mid=(low+high)/2;

                if(arr[mid]==x)
                {
                    return mid;
                }
                else if(arr[mid]<=x)
                {
                    floor = arr[mid];
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }
            return floor;
        }
        public static int Printceil(int arr[],int n,int x)
        {
            int low=0;
            int high=n-1;
            int ceil=-1;

            while (low<=high)
            {
                int mid=(low+high)/2 ;
                
                if(arr[mid]==x)
                {;
                    return mid;
                }
                else if(arr[mid]<x)
                {
                    low =mid+1;
                }
                else
                {   
                    ceil=arr[mid];
                    high=mid-1;
                }
            }
            return ceil;
        }
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 10, 10, 12, 19};
        int n=arr.length;
        int x = 5;

        int floor=Printfloor(arr, n, x);
        int ceil=Printceil(arr, n, x);

        System.out.println("Floor of "+x+":"+floor);
        System.out.println("ceil of "+x+":"+ceil);

    }
}
