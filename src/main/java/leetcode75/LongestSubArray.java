package leetcode75;

public class LongestSubArray {

    public static void main(String[] args) {
        LongestSubArray longestSubArray = new LongestSubArray();
        int m = longestSubArray.max(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1});
        System.out.println(m);
    }


    private int max(int[] nums) {

        int right = 0;
        int left = 0;
        int max = 0;
        int zeros = 0;

        while (right < nums.length) {

            if (nums[right] == 0) {
                zeros++;
            }

            while (zeros > 1) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }

            max = Math.max(max, right - left);

            right++;
        }

        return max;
    }
}

