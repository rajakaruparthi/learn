package leetcode75;

public class MaxKSum {


    public static void main(String[] args) {
        MaxKSum maxKSum = new MaxKSum();
        int max = maxKSum.maxSum(new int[]{1, 2, 4, 6, 3}, 3);
        System.out.println(max);
    }

    private int maxSum(int[] input, int k) {
        int start = 0;
        int max = 0;
        int sum = 0;

        for (int i = 0; i < input.length; i++) {
            sum = sum + input[i];

            if (i - start + 1 == k) {
                max = Math.max(max, sum);
                sum = sum - input[start];
                start = start + 1;
            }
        }
        return max;
    }
}
