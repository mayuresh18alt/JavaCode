
public class Reverse {

    public static void printReeverse(int arr[],int n)
    {
        int i=0;
        int j=n-1;
        {
            while (i < j) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
                System.out.println("after reverse array");

                for(int k=0;k<n;k++)
                {
                    System.out.print(" "+arr[k]);
                }

        }
    }
    
    public static void main(String[] args) {
        
        int arr[]={11,2222,43,144,555};
        int n=arr.length;

        System.out.println("before reverse array");
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+arr[i]);
            
        }
        System.out.println();
        

        printReeverse(arr, n);
    }
}
