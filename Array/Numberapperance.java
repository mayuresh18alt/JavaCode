public class Numberapperance
{
    public static int getSingleElement(int []arr,int n)
    {
        for (int i = 0; i < n; i++)
        {
            int num = arr[i]; 
            int cnt = 0;

            for (int j = 0; j < n; j++)
            {
                if (arr[j] == num)
                    cnt++;
            }

            if (cnt == 1) return num;
        }

        return -1;
    }
        public static void main(String[] args)
        {
            
            int arr[]={4, 1, 2, 1, 2};
            int n=arr.length;

            int ans=getSingleElement(arr, n);
            System.out.print("single element is the"+" "+ans);
        
        }
}
