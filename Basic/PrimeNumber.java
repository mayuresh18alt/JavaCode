package Basic;
import java.util.Scanner;

public class PrimeNumber {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int num;

        System.out.println("enter the value of the num");
        num=sc.nextInt();

        for(int i=1; i<=num/2;i++){
        if(num%i==0)
        {
            System.out.println(num+"is prime  number");
        }
        
      }
    }
}
