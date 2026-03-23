public class copyToAnother {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int[] copiedArr = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
      copiedArr[i] = arr[i];
    }

    // Print the copied array
    for (int num : copiedArr) {
      System.out.print(num + " ");
    }
  }
}
