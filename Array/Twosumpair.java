public class Twosumpair {
    public static int Printtwosumpair(int arr[],int n, int target)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
               int k=arr[i]+arr[j];
                if(k==target)
                
                    return k;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        
        int arr[]={2,6,5,8,11};
        int n=arr.length;
        int target=14;

        System.out.print(Printtwosumpair(arr, n, target));
    }
}
