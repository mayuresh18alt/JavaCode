package Basic;

public class Fibonacci {

    public static void main(String[] args) {
      int n = 10; // Change this to modify the number of terms
  
      int a = 0;
      int b = 1;
      int c;
  
      System.out.print(a + " " + b);
  
      for (int i = 2; i < n; i++) {
        c = a + b;
        System.out.print(" " + c);
        a = b;
        b = c;
      }
    }
  }
  