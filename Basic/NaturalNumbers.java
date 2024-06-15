package Basic;
import java.util.Scanner;

public class NaturalNumbers {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int sum=0;
        int num;

        System.out.println("enter the value of the num");
        num=sc.nextInt();

        for(int i=1; i<=num;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum+"\tsum of n natural numbers");
    }
}
