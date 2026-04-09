import java.util.HashMap;
import java.util.Scanner;

class operation{

  //Palindrome function
  void palindrome(String str){
    String reverse = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      reverse += str.charAt(i);
    }
    if (str.equals(reverse)) {
      System.out.println("The string is a palindrome.");
    } else {
      System.out.println("The string is not a palindrome.");
    }
  }

    //prime function
    void prime(int num){
    boolean isPrime = true;
    if (num <= 1) {
      isPrime = false;
    } else {
      for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
          isPrime = false;
          break;
        }
      }
    }
    if (isPrime) {
      System.out.println(num + " is a prime number.");
    } else {
      System.out.println(num + " is not a prime number.");
    }
  }

  //Sorting function
  void sorting(int[] arr){
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    System.out.println("Sorted array: ");
    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();
  }

  //Reverse string function
  void reverseString(String str){
    String reverse = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      reverse += str.charAt(i);
    }
    System.out.println("Reversed string: " + reverse);
  }

  //Frequency count function
  void freqCount(HashMap<Character, Integer> freqMap, String str){
    for (char c : str.toCharArray()) {
      freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
    }
    System.out.println("Character frequency: ");
    for (char key : freqMap.keySet()) {
      System.out.println(key + ": " + freqMap.get(key));
    }
  }
}
public class mainChallenge {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    operation op = new operation();
    System.out.println("Enter choice: 1 for palindrome, 2 for prime, 3 for sorting, 4 for reverse string, 5 for frequency count");
    int choice = sc.nextInt();
    sc.nextLine(); // Consume newline
    switch (choice) {
      case 1:
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        op.palindrome(str);
        break;
      case 2:
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        op.prime(num);
        break;
      case 3:
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
          arr[i] = sc.nextInt();
        }
        op.sorting(arr);
        break;
      case 4:
        System.out.println("Enter a string: ");
        String str2 = sc.nextLine();
        op.reverseString(str2);
        break;
      case 5:
        System.out.println("Enter a string: ");
        String str3 = sc.nextLine();
        HashMap<Character, Integer> freqMap = new HashMap<>();
        op.freqCount(freqMap, str3);
        break;
      default:
        System.out.println("Invalid choice.");
    }
  }
}
