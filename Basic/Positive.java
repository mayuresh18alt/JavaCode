package Basic;
import java.util.Scanner;

public class Positive{

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        int number;
       

        System.out.println("enter the number");
        number=sc.nextInt();

        if(number>0)
        {
            System.out.println(number+"is postive");
        }
        else 
        {
            System.out.println(number+"is negative");
        }

    }
}