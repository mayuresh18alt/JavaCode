
import java.util.Scanner;

public class Kthelement {

    public static void Findkthelement(int arr[],int n)
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
        for(int j=0;j<n;j++)
        {
            System.out.print(arr[j]+" ");
        }
        System.out.println();

        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("max element is the "+" "+max);


        int min=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("max element is the "+" "+min);
     }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        int arr[]={99,14,111,3,87,4};
        int n=arr.length;

        System.out.println("Before sorting array");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        Findkthelement(arr, n);
    }
}
