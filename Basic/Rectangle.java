package Basic;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        
        int length;
        int breadth;

        System.out.println("Enter the length of the rectangle");
        length=sc.nextInt();
        System.out.println("Enter the breadth of the rectangle");
        breadth=sc.nextInt();

        int area=length*breadth;
        System.out.println("Area of the rectangle is "+area);
        
    }
}
