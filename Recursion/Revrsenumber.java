package Recursion;

import java.util.Scanner;

public class Revrsenumber {
    

    public static void revrseNumber(int n,int temp)
    {
        int rev=0;
        int rem;

        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }

        System.out.println("reverse a number"+" "+rev);
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int n;

        System.out.println("enter the number");
        n=sc.nextInt();

        int temp=n;

        revrseNumber(n, temp);


    }
}
