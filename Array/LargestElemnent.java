public class LargestElemnent {
    
    public static void findLargestElement(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j+1]<arr[j])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("After sorting array");
        for(int i=0;i<n;i++)
        {   
            System.out.print(arr[i]+" ");
        }   
        System.out.println();
        System.out.println("Largest elemnt of the array is the "+" "+arr[n-1]);
    }
    public static void main(String[] args) {
        
        int arr[]={11,2222,43,144,555};
        int n=arr.length;

        System.out.println("Before sorting array");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        findLargestElement(arr, n);
    }
}
