import java.util.Scanner;

public class ArrayOne {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n;
        System.out.println("enter the size of the array");
        n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
