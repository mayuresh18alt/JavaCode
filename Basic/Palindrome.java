package Basic;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int reverse=0;
        int rem;
        int num;

       

        System.out.println("enter the value of the num");
        num=sc.nextInt();

       int temp=num;

        while (temp!=0) {

            rem=temp%10;
            reverse=reverse*10+rem;
            temp=temp/10;
        }

            if(num==reverse)
            {
                System.out.println(num+"\n is palindrome nuber");
            }
            else
            {
                System.out.println(num+"\n is not palindrome nuber");
            }
    }
}
