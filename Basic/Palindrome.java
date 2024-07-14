package Basic;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        
       Scanner sc=new Scanner(System.in);
        
       int n;
       int reverse=0;
       int reminder=0;

       System.out.println("enter the value of the n");
       n=sc.nextInt();

       int temp=n;

       while(temp!=0)
       {
        reminder=temp%10;
        reverse=reverse*10+reminder;
        temp=temp/10;
       }
       if(reverse!=n)
       {
        System.out.println(n+" "+"the number is not a palindrome");
       }
       else
       {
        System.out.println(n+" "+"the number is a palindrome");
       }
    }
}
