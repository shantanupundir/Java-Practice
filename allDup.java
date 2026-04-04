import java.util.HashSet;

public class allDup {
  public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();
    int arr[] = {1,2,3,2,4,3,6,8,4,9};
    System.out.println("Duplicate numbers in the array:");
    for(int i:arr){
      if(set.contains(i)){
        System.out.println(i);
      }else{
        set.add(i);
      }
    }
  }
}
