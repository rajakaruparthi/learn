package leetcode75;

public class FactRec {

    public static void main(String[] args) {
        int out = fact(10);
        System.out.println(out);
    }

    private static int fact(int r) {
        if (r != 1) {
            return r * fact(r - 1);
        }
        return 1;
    }
}
