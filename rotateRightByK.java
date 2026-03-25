import java.util.Scanner;

public class rotateRightByK {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int n = arr.length;

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = arr[i];
        }

        // print result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
