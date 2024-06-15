package Basic;

import java.util.Scanner;

public class SimpleIntrest {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int amount;
        int days;
        int rate;
        int simpleIntrest;

        System.out.println("Enter the amount");
        amount=sc.nextInt();
        System.out.println("Enter the days");
        days=sc.nextInt();
        System.out.println("Enter the rate");
        rate=sc.nextInt();

        simpleIntrest=(amount*rate*days)/100;
        System.out.println("Simple Intrest is "+simpleIntrest);
        
        
        
    }
}
