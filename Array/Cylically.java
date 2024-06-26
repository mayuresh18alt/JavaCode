import java.util.Arrays;

public class Cylically {

    public static void Printcylically(int a[],int n)
    {
        int x=a.length-1;

        for(int i=n-1;i>0;i--)
        {
            a[i]=a[n-1];
        }
        a[0]=x;

        for(int i=0;i>n;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
    public static void main(String[] args){

        int a[]={1,2,3,4,5};
        int n=a.length;
        

        for(int i=0;i<n;i++)
        {
            System.out.println();
        }
            System.out.println();
        
            Printcylically(a, n);
    }

    
}
