import java.util.Arrays;

public class Cylically {

    public static void main(String[] args){

        int a[]={1,2,3,4,5};
        int x=a.length-1;
        for(int i=a.length-1;i>0;i--)
        {
            a[i]=a[a.length-1];

            a[0]=x;
        }
        for(int i=0;i<a.length;i++)
        {
            sytem.out.println(a[i]+" ");

        }
    }

    
}
