package Basic;

import java.util.Scanner;

public class CharactersPrint {
        
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        char ch;
        System.out.println("Enter the character");
        ch=sc.next().charAt(0);
        
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(1);
        } 
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
    }
}
