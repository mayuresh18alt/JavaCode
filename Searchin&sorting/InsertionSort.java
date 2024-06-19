public class InsertionSort
{
    public static void insertion_Sort(int arr[],int n)
    {
        for (int i=0;i<=n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[i])
                {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
            // int j=i;
            // while (j>0 && arr[j-1] >arr[j])
            // {
            //     int temp=arr[j-1];
            //     arr[j-1]=arr[j];
            //     arr[j]=temp;
            //     j--;
            // }
        }
        System.out.println("after sorting array");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
    public static void main(String[] args)
    {
        {
            int arr[] ={14,9,15,12,6,8,13};
            int n=arr.length;

            System.out.println("befor sorting array");
            for (int i=0;i<n;i++)
            {
                System.out.print(arr[i]+"  ");
            }
            System.out.println();
            insertion_Sort(arr,n);
        }
    }
}
