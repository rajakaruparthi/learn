package leetcode75;

public class MaxAvgSubArray643 {

    public static void main(String[] args) {
        MaxAvgSubArray643 maxAvgSubArray643 = new MaxAvgSubArray643();
        maxAvgSubArray643.findMaxAverage(new int[]{3, 7, 8, 9}, 2);
    }

    public double findMaxAverage(int[] nums, int k) {

        int start = 0;
        int sum = 0;
        double avg = 0;
        double max = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (i - start + 1 == k) {
                avg = (double) sum / k;
                max = Math.max(avg, max);
                sum -= nums[start];
                start = i - k + 2;
            }
        }

        return max;
    }
}
