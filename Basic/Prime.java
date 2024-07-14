package Basic;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n;
        System.out.println("enter the value of the n");
        n=sc.nextInt();

        if(n%2==0)
        {
            System.out.println(n+"is even number");
        }
        else
        {
            System.out.println(n+" "+"is odd number");
        }
        
    }
}
