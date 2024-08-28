package leetcode75;

public class GcdOfString {

    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equalsIgnoreCase((str2 + str1))) {
            return "";
        }

        int l1 = str1.length();
        int l2 = str2.length();

        int gcd = gcd(l1, l2);
        return str1.substring(0, gcd);

    }


    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        GcdOfString string = new GcdOfString();
        string.gcdOfStrings("ABC", "ABCABC");
    }

}
