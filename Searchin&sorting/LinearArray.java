public class LinearArray {

    public static int inearsearch(int arr[],int n, int target)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;

        System.out.println( "array is the following");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        int target=5;
        System.out.println("target element is the "+" "+target);

        System.out.println(inearsearch(arr, n, target));

        int result=inearsearch(arr, n, target);
        if(result==-1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element found at index "+result);
        }

        
    }
}
