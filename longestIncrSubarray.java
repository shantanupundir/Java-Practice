public class longestIncrSubarray {
  public static void main(String[] args) {
    int[] arr = {1, 2, 1, 4, 5, 3, 7, 2, 9};
    int maxLength = 1;
    int currentLength = 1;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > arr[i - 1]) {
        currentLength++;
      } else {
        maxLength = Math.max(maxLength, currentLength);
        currentLength = 1;
      }
    }
    maxLength = Math.max(maxLength, currentLength);
    System.out.println("The length of the longest increasing subarray is: " + maxLength);
  }
}
