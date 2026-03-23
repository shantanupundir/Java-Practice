import java.util.Scanner;

public class reverseArray {
  public static void main(String[] args) {
    // int[] arr = {1, 2, 3, 4, 5};
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    int[] reversedArr = new int[arr.length];

    for(int i=arr.length -1; i>=0;i--){
      reversedArr[arr.length - 1 - i] = arr[i];    }

    // Print the reversed array
    for (int num : reversedArr) {
      System.out.print(num + " ");
    }
  }
}
