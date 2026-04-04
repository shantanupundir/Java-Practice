public class allPairSumEqualTarget {
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,2,5,8,9,6,4,7,8};
    int target = 10;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == target) {
          System.out.println("Pair found: " + arr[i] + " + " + arr[j] + " = " + target);
        }
      }
    }
  }
}
