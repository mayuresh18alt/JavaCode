package String;

import java.util.Scanner;

public class revesrse {

    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);

    String name;

    System.out.println("Enter your name");

    name=sc.nextLine();

    System.out.println("Name: "+name);

    String rev="";

    for(int i=name.length()-1;i>=0;i--){
        rev=rev+name.charAt(i);
    }

    System.out.println("reverse a name"+" "+rev);
    

    }
}
