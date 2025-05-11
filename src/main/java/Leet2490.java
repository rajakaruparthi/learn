public class Leet2490 {

    public static void main(String[] args) {
        System.out.println(isCircularSentence("leetcode exercises sound delightful"));
        System.out.println(isCircularSentence("eetcode"));
        System.out.println(isCircularSentence("Leetcode is cool"));
    }

    private static boolean isCircularSentence(String s) {
        String[] ary = s.split(" ");
        if (ary.length == 1) {
            return ary[0].charAt(ary[0].length() - 1) == ary[0].charAt(0);
        }

        for (int i = 0; i < ary.length - 1; i++) {
            if (ary[i].charAt(ary[i].length() - 1) != ary[i + 1].charAt(0)) {
                return false;
            }
        }

        return ary[0].charAt(0) == ary[ary.length - 1].charAt(ary[ary.length - 1].length() - 1);
    }
}
