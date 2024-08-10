import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrayrotedtimes {

    public static int Printroatedarray(ArrayList<Integer>list)
    {
        int low=0;
        int high=list.size()-1;

        while (low<high)
        {
            int mid=(low+high)/2;

            if(list.get(mid)>list.get(high)) 
            {
                low=mid+1;
            } 
            else
            {
                high=mid;
            }  
        }
        return low;
    } 
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(4,5,6,7,0,1,2,3));
        
        int result=Printroatedarray(list);
        Arrayrotedtimes arr=new Arrayrotedtimes();

        System.out.println("The array has been rotated " + result + " times.");  // Output: 4
        
    }
}
