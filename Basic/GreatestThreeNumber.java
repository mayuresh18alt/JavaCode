package Basic;
import java.util.Scanner;

public class GreatestThreeNumber {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n1,n2,n3;

        System.out.println("enter the value for the n1");
        System.out.println("enter the value for the n2");
        System.out.println("enter the value for the n3");

        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();

        if(n1>n2 && n1>n3)
        {
            System.out.println(n1+"\t is greatest number");
        }
        else if(n2>n3 && n2>n1)
        {
            System.out.println(n2+"\t is greatest number");
        }

        else
        {
            System.out.println(n3+"\t is greatest number");
        }
    }
}
