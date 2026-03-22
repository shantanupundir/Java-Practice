import java.util.Scanner;

public class oddEven {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int size = sc.nextInt();
    System.out.println("Enter the elements of the array:");
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    int oddCount = 0;
    int evenCount = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        evenCount++;
      } else {
        oddCount++;
      }
    }
    System.out.println("Number of even elements: " + evenCount);
    System.out.println("Number of odd elements: " + oddCount);
  }
}
