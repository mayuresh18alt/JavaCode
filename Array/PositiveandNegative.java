

public class PositiveandNegative {

    public static void Onesideallnumbers(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j+1]>arr[j])
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
    }
    
    public static void main(String[] args) {
        
        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
        int n=arr.length;

        System.out.println("After sorting array");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        Onesideallnumbers(arr, n);
    }
}
