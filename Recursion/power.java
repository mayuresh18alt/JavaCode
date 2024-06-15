package Recursion;

import java.util.Scanner;

public class power {
    
    public static void printPower(int num)
    {
        int power=num*num*num;

        System.out.println(power+" "+"power of the"+" " +num);
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int num;
        

        System.out.println("entet the value of the num");
        num=sc.nextInt();
        printPower(num);

    }
}
