public class Longestsubarray {

    public static int Subarray(int arr[],int n)
    {
        int k1=10;
        int length=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int sum=0;
                for(int k=i;k<n;k++)
                {
                    sum+=arr[k];
                }
                if(sum==k1)
                {
                    length=Math.max(length,j-i+1);
                }
            }
        }
        return length;
    }
    public static void main(String[] args) {
        
        int arr[]={2,3,5,1,9};
        int n=arr.length;

        int ans=Subarray(arr, n);

        System.out.println("long subarray is the"+" "+ans);
    }
}
