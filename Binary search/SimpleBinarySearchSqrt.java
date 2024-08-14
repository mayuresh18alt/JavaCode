public class SimpleBinarySearchSqrt  {
    private static int squareRoot(int x) {
        if(x<0)
        {
            System.out.println("Cannot find square root of a negative number.");
        }
        if(x==1 || x==0)
        {
            return x;
        } 

        int low=0;
        int high=x;
        int result=0;

        while(low<=high)
        {
            int mid=(low+high)/2;
            int midsquared=mid*mid;


            if(midsquared==x)
            {
                return mid;
            }
            else if(midsquared<x)
            {
                low=mid+1;
                result=mid;
            }
            else
            {
                high=mid;
            }
        }

        return x;

    } 
    public static void main(String[] args)
    {
        int x=16;
        int result=squareRoot(x);
        System.out.println("square root of "+x+" "+"is approximately:"+result);
    }
    
}
