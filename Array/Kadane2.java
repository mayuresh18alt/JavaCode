// Print subarray with maximum subarray sum (extended version of above problem)
public class Kadane2 {
    public static void Printkadanesubarray(int arr[],int n)
    {
        int maxsum=0;
        int cursum=0;    
        int tempstart=0;
        int start=0;
        int end=0;

        for(int i=0;i<n;i++)
        {
            cursum=cursum+arr[i];
            for(int j=i;j<n;j++)
            {
                if(cursum>maxsum)
                {
                    maxsum=cursum;
                    start=tempstart;
                    end=i;
                }
                if(cursum<0)
                {
                    cursum=0;
                    end=i+1;
                }
            }
        }
        System.out.println("Maximum Subarray Sum: " + maxsum);

        System.out.print("Subarray with Maximum Sum: ");
        for (int i = start; i <= end; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {

        int arr[]={ -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n=arr.length;

        Printkadanesubarray(arr, n);
    }
}
