package leetcode75;

public class IsSubsequence392 {

    public boolean isSubsequence(String s, String t) {
        int l1 = 0;
        int l2 = 0;

        while (l2 < t.length() && l1 < s.length()) {
            if (t.charAt(l2) == s.charAt(l1)) {
                l1++;
                l2++;
            } else {
                l2++;
            }
        }

        return l1 == s.length();
    }

    public static void main(String[] args) {
        IsSubsequence392 isSubsequence392 = new IsSubsequence392();
        System.out.println(isSubsequence392.isSubsequence("b", "abdec"));
    }
}
