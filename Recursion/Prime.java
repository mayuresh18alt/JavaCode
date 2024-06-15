package Recursion;

import java.util.Scanner;

public class Prime {

    public static void printPrimee(int num)
    {
        if(num%1==0)
        {
            System.out.println(num+ " " +  " is prime number");
        }
        else
        {
            System.out.println(num+ " " +  " is not prime number");
        }
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int num;

        System.out.println("enter the value of the num");
        num=sc.nextInt();

        printPrimee(num);
    }
}
