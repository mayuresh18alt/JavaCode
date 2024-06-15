package Basic;
import java.util.Scanner;

public class greatestTwoNumbers {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n1;
        int n2;

        System.out.println("enter the value for the n1");
        System.out.println("enter the value for the n2");

        n1=sc.nextInt();
        n2=sc.nextInt();


        if(n1>n2)
        {
            System.out.println(n1+"\tis greatest number");
        }
        else
        {
            System.out.println(n2+"\tis greatest number");
        }

    }
}
