public class BubbleSort
{
    public static void bubble_Sort(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {

            for(int j=0;j<arr.length-1;j++)
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
        
    }
    public static void main(String[] args)
    {
        int arr[]={13,46,24,52,20,9};
        int n= arr.length;

        System.out.println("before sorting array");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();

        bubble_Sort(arr,n);
    }

}
