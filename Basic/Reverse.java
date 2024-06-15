package Basic;
import java.util.Scanner;

public class Reverse {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int reverse=0;
        int rem;
        int num;

        System.out.println("entee the value of the num");

        num=sc.nextInt();

       while(num!=0)
       {
            rem=num%10;
            reverse= reverse*10+rem;
            num=num/10;
       }
       System.out.println("reverse number are the \t"+" "+reverse);
    }
}
