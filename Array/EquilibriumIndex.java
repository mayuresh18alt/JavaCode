public class EquilibriumIndex {
    public static int Printeuilibriumindex(int arr[],int n)
    {
        int totalsum=0;
        int leftsum=0;

        for(int num:arr)
        {
            totalsum+=num;

        }
        for(int i=0;i<=n;i++)
        {
            totalsum-=arr[i];

            if(leftsum==totalsum)
            {
                return i;
            }
            leftsum+=arr[i];
        }
        
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,2,2};
        int n=arr.length;
        int index = Printeuilibriumindex(arr, n);

        if (index != -1) {
            System.out.println("Equilibrium index is: " + index);
        } else {
            System.out.println("No equilibrium index found.");
        }
        
    }
}
