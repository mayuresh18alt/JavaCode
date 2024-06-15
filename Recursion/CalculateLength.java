package Recursion;

import java.util.Scanner;

public class CalculateLength {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        String Fullname;

        System.out.println("enter your full name");
        Fullname=sc.nextLine();
        
        int lenght=Fullname.length();


        System.out.println("length of string is"+" "+lenght);
  
    }
}
