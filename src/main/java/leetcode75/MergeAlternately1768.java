package leetcode75;

public class MergeAlternately1768 {


    public static void main(String[] args) {
        mergeAlternately("abc", "pqr");
        mergeAlternately("abc", "pqrst");
        mergeAlternately("abcde", "pqr");
    }

    public static String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        String s = "";
        if (l1 > l2) {
            for (int i = 0; i < l2; i++) {
                s = s + word1.charAt(i);
                s = s + word2.charAt(i);
            }
            s = s + word1.substring(l2, l1);
        } else {
            for (int i = 0; i < l1; i++) {
                s = s + word1.charAt(i);
                s = s + word2.charAt(i);
            }
            s = s + word2.substring(l1, l2);
        }
        return s;
    }
}
