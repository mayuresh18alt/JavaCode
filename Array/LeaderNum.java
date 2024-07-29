public class LeaderNum {
    public static void Printleadernum(int arr[],int n)
    {
        for (int i = 0; i < n; i++) 
        {
            int j;
            for (j = i + 1; j < n; j++) 
            {
                if (arr[i] <=arr[j])
                    break;
            }
            if (j == n) // the loop didn't break
                System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        
        int arr[]={10, 22, 12, 3, 0, 6};
        int n=arr.length;

      Printleadernum(arr, n);  
    }
}
