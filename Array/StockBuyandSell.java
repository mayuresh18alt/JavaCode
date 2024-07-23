public class StockBuyandSell {
    public static void Printstockbuyandsell(int arr[],int n) {
        int maxprofit=0;
        int min=arr[0];
        for(int i=0;i<n;i++)
        {
            min=Math.min(min,arr[i]);
            int profit=arr[i]-min;
            maxprofit=Math.max(maxprofit, profit);
        }
        System.out.println("maxprofit is "+" "+maxprofit);
    }
    public static void main(String[] args) {
        
        int arr[]={7,1,5,3,6,4};
        int n=arr.length;

        Printstockbuyandsell(arr, n);
    }
}
