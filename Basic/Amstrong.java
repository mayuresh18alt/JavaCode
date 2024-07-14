package Basic;
import java.util.Scanner;

public class Amstrong {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int num;
        int rem;
        int reverse=0;

        System.out.println("enter the value of the num");
        num=sc.nextInt();

        int temp=num;

        while(temp!=0)
        {
            rem=temp%10;
            reverse=reverse+rem*rem*rem;
            temp=temp/10;
        }
        if(reverse==num)
        {
            System.out.println(num+" "+"is amstrong number");
        }
        else
        {
            System.out.println(num+" "+"is not amstrong number");
        }

    }
}
