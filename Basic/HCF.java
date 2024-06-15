package Basic;
import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int num1;
        int num2;
        int hcf=0;

        System.out.println("enter the value of the num1 and num2");
        num1=sc.nextInt();
        num2=sc.nextInt();

        for(int i=1;i<=num1 || i<=num2;i++)
        {
            if(num1 %i==0 && num2%i==0)
            {
                hcf=i;
            }
        }
        System.out.println("The hcf:"+hcf);
    }
}
