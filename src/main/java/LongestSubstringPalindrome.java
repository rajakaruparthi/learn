public class LongestSubstringPalindrome {


    private String longestPalindrome(String s) {

        int max = 0;
        char[] ary = s.toCharArray();
        String out = "";

        if (ary.length > 1) {
            for (int i = 0; i < ary.length; i++) {

                if((ary.length - i) > max) {

                    for (int j = i; j < ary.length; j++) {

                        if (i == j && max < 1) {
                            out = output(s, i, j);
                        }

                        if (checkPalindrome(ary, i, j)) {
                            if (max < j - i) {
                                max = j - i;
                                out = output(s, i, j);
                            }
                        }
                    }
                }
            }
        } else {
            return s;
        }

        return out;
    }

    private String output(String s, int i, int j) {
        return s.substring(i, j + 1);
    }

    private boolean checkPalindrome(char[] s, int startIndex, int endIndex) {

        boolean palindrome = false;

        int j = 0;

        while (j < Math.ceil((double) (endIndex - startIndex) / 2)) {
            if (s[startIndex + j] == s[endIndex - j]) {
                palindrome = true;
            } else {
                return false;
            }
            j++;
        }
        return palindrome;
    }

    public static void main(String[] args) {
        LongestSubstringPalindrome l = new LongestSubstringPalindrome();
        String out = l.longestPalindrome("babad");
        System.out.println(out);
//        System.out.println(l.checkPalindrome("babad".toCharArray(), 1 , 4));
    }
}
