package Recursion;

public class Smallest {
    
    public static void smallElement(int arr[])
    {
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
           if(arr[i]<min)
           {
            min=arr[i];
           }
        }
        System.out.println("smallest element in the array"+" "+min);
    }
    public static void main(String[] args) {
        
        int arr[]={4,3,21,33,22,56};

        smallElement(arr);
    }
}
