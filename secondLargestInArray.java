public class secondLargestInArray {
  public static void main(String[] args) {
    int[] arr = {5,9,2,7,4,8};
    int n = arr.length;
    int largest = arr[0];
    int secondLargest = arr[1];
    for (int i = 1; i < n; i++) {
      if (arr[i] > largest) {
        secondLargest = largest;
        largest = arr[i];
      } else if (arr[i] > secondLargest && arr[i] != largest) {
        secondLargest = arr[i];
      }
    }
    System.out.println("The second largest element in the array is: " + secondLargest);
  }
}
