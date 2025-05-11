public class Leetcode121 {


    public static void main(String[] args) {
        int i = calculateMaxReturn(new int[]{7, 1, 5, 3, 6, 4});
        System.out.println(i);
    }

    private static int calculateMaxReturn(int[] inp) {
        if (inp.length < 2) {
            return 0;
        }
        int left = 0;
        int right = 1;
        int maxProfit = 0;
        int cal;

        while (right < inp.length) {
            if(inp[left] < inp[right]) {
                cal = inp[right] - inp[left];
                maxProfit = Math.max(maxProfit, cal);
            } else {
                left = right;
            }
            right++;
        }

        return maxProfit;
    }
}
