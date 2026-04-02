public class missingNumInRange {
  public static void main(String[] args) {
    int arr[] = {1,3,4,5,6};
    int length = arr.length + 1;
    int expectedSum = length * (length + 1) / 2;
    int actualSum = 0;
    for (int i : arr) {
      actualSum += i;
    }
    int missingNum = expectedSum - actualSum;
    System.out.println("The missing number in the range is: " + missingNum);

  }
}
