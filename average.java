import java.util.Scanner;

public class average {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the size of the array:");
    int size = sc.nextInt();
    System.out.println("Enter the elements of the array:");
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    double average = (double) sum / arr.length;
    System.out.println("Average of the array: " + average);
  }
}
