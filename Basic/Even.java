package Basic;
import java.util.Scanner;

public class Even {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int num;

        System.out.println("enter the value of the scanner");
        num=sc.nextInt();

        if(num%2==0)
        {
            System.out.println(num+"is even ");
        }
        else
        {
            System.out.println(num+"is odd ");
        }
    }
}
