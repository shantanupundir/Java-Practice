import java.util.Arrays;

public class anagramString {
    public static boolean areAnagramsSorting(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        // Sort the character arrays
        Arrays.sort(c1);
        Arrays.sort(c2);

        // Compare the sorted arrays
        return Arrays.equals(c1, c2);
    }
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagramsSorting(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
