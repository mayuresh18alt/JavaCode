import java.util.Scanner;

public class LeftRotateArray {
    
    public static void Printleftrotatearray(int arr[],int n)
    {

        int temp=arr[0];
        for(int i=1;i<n;i++)
        {
            arr[i-1]=arr[i];
        }    
        arr[n-1]=temp;  

        System.out.println("After left rotation array");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        int n=arr.length;

        System.out.println("Before rotation array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        Printleftrotatearray(arr, n);
    }
    
        
}
