package Recursion;

public class Largest {
    
public static void printBiggest(int arr[])
{
    int max=arr[0];

    for(int i=1; i<arr.length;i++)
    {
        if(arr[i]>max)
        {
            max=arr[i];
        }
    }
    System.out.println("Largest element in the array"+" "+max);
}
    public static void main(String[] args) {
        
        int arr[]={12,14,21,20,1,4};

        printBiggest(arr);
        
    }
}
