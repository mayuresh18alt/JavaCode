package Basic;
import java.util.Scanner;

public class Amstrong {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int num;
        int rem;
        int result=0;

        System.out.println("enter the value for the num");
        num=sc.nextInt();

        int temp=num;
        while (temp!=0) {

            rem=temp%10;
            result=rem*rem*rem;
            temp=temp/10;
        }
        if (result==num)
        {
            System.out.println(num+"\n is Amstrong number");
        }
        else
        {
            System.out.println(num+"\n is not Amstrong number");
        }
    }
}
