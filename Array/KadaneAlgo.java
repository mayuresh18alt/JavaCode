public class KadaneAlgo {
    public static void Printkadanealgo(int arr[],int n)
    {
        int maxsum=0;
        int cursum=0;

        for(int i=0;i<n;i++)
        {
            cursum=cursum+arr[i];

            for(int j=i;j<n;j++)
            {
                if(cursum > maxsum)
                {
                    maxsum=cursum;
                }
                if(cursum < 0)
                {
                    cursum=0;
                }
            }
        }
        System.out.println("Maximum Subarray Sum: " + maxsum);

    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int n=arr.length;
        Printkadanealgo(arr, n);
    }
}
