package Basic;
import java.util.Scanner;

public class LeapYear {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n;

        System.out.println("enter the value of n");
        n=sc.nextInt();

        if(n%4==0)
        {
            System.out.println(n+"is leap year");
        }
        else
        {
            System.out.println(n+"is not leap year");
        }
    }
}
