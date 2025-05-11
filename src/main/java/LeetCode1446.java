import java.util.Map;

public class LeetCode1446 {

    public static void main(String[] args) {
        int count = maxPower("leetcode");
        int count2 = maxPower("abbcccddddeeeeedcba");
        int count3 = maxPower("ccbccbb");
        System.out.println(count);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(maxPower("cc"));
    }


    private static int maxPower(String s) {
        int left = 0;
        int right = 1;
        int sum = 1;
        int max = 0;
        if (s.length() == 1) {
            return 1;
        }

        while (right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                sum++;
            } else {
                max = Math.max(max, sum);
                sum = 1;
            }
            left++;
            right++;
        }

        max = Math.max(max, sum);

        /*if (inp.length == 1) {
            return 1;
        }

        while (right < inp.length) {
            if (inp[left] == inp[right]) {
                sum++;
            } else {
                max = Math.max(sum, max);
                sum = 1;
                left++;
            }
            right++;
        }
*/

        return max;
    }
}
