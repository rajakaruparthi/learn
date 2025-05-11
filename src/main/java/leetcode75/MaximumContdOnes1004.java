package leetcode75;

public class MaximumContdOnes1004 {

    public static void main(String[] args) {

    }

    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int right = 0;
        int max = 0;
        int zerosCount = 0;

        while (right < nums.length) {

            if (nums[right] == 0) {
                zerosCount++;
            }

            while (zerosCount < k) {
                zerosCount++;
                if (zerosCount == k) {
                    max = Math.max(max, right - left);
                    left++;
                    zerosCount--;
                }
            }

            right++;
        }

        return max;
    }

}
