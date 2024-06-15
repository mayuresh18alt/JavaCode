

public class MaxandMin {

    public static void findMMaxandMinNumber(int arr[],int n)
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
        System.out.println("After Sorting array");
            for (int i=0;i<n;i++)
            {
                System.out.print(arr[i]+"  ");
            }
            System.out.println();

            System.out.println("Max elemnt of the array is the "+" "+arr[n-1]);

            System.out.println("Min elemnt of the array is the "+" "+arr[0]);

    }

    public static void main(String[] args) {
        
        int arr[]={13,46,24,52,20,9};
        int n=arr.length;

        System.out.println("Before sorting array");

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        findMMaxandMinNumber(arr, n);
    }
}
