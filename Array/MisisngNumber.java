public class MisisngNumber {
    
    public static void main(String[] args) {
        

        int[] arr = {1, 2, 3};
        int n = arr.length;
       int total=(n+1)*(n+2)/2;
       int sum=0;
       for(int i=0;i<n;i++)
       {
            sum+=arr[i];
       }
        System.out.println("Missing number is: ");
        System.out.println(total - sum);

    }
}
