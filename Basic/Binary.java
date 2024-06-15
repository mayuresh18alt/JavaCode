package Basic;
import java.util.Scanner;

public class Binary {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int binary_num;
        System.out.println("enetr the value of the ");
        binary_num=sc.nextInt();

        int decimal=0;
        int n=0;

        while (binary_num >0) {
            int temp=binary_num%10;
            decimal+=temp*Math.pow(2,n);
            binary_num=binary_num/10;
            n++;
        }
        System.out.println("decimal number is:"+decimal);
    }
}
