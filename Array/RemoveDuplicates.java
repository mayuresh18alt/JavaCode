import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] arr) {
      Set<Integer> uniqueSet = new HashSet<>();
      List<Integer> uniqueList = new ArrayList<>();
  
      for (int num : arr) {
        if (uniqueSet.add(num)) {
          uniqueList.add(num);
        }
      }
  
      // Convert the List back to an array (optional)
      int[] uniqueArr = new int[uniqueList.size()];
      for (int i = 0; i < uniqueList.size(); i++) {
        uniqueArr[i] = uniqueList.get(i);
      }
      return uniqueArr;
    }
  
    public static void main(String[] args) {
      int[] arr = {10, 20, 20, 30, 30, 40, 50, 50};
      int[] newArr = removeDuplicates(arr);
      for (int num : newArr) {
        System.out.print(num + " ");
      }
    }
  }
  