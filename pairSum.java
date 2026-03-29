import java.util.HashSet;
import java.util.Set;

public class pairSum {
  public static void main(String[] args) {
    // int[] arr = {1, 2, 3, 4, 5};
    // int target = 5;
    // for(int i=0; i<arr.length; i++){
    //   for(int j=i+1; j<arr.length; j++){
    //     if(arr[i] + arr[j] == target){
    //       System.out.println("Pair found: " + arr[i] + " and " + arr[j]);
    //     }
    //   }
    // }

    int[] arr = {2, 4, 3, 5, 7, 8};
        int target = 7;

        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;

            if (set.contains(complement)) {
                System.out.println(complement + ", " + num);
            }

            set.add(num);
        }
  }
}
