import java.util.Arrays;

public class LeetCode561 {

    public static void main(String[] args) {
        int out = max(new int[]{1, 4, 3, 2});
        int out2 = max(new int[]{6, 2, 6, 5, 1, 2});
        System.out.println(out);
        System.out.println(out2);
    }

    private static int max(int[] inp) {
        Arrays.sort(inp);
        int sum = 0;
        for (int i = 0; i < inp.length; i = i + 2) {
            sum += inp[i];
        }
        return sum;

    }
}
