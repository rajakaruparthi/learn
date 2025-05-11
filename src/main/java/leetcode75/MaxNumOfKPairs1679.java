package leetcode75;

import java.util.Arrays;

public class MaxNumOfKPairs1679 {

    public static void main(String[] args) {
        MaxNumOfKPairs1679 maxNumOfKPairs1679 = new MaxNumOfKPairs1679();
        int out = maxNumOfKPairs1679.maxOperations(new int[]{2, 2, 2, 3, 1, 1, 4, 1}, 4);
        System.out.println(out);
    }

    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);

        int ans = 0;
        int left = 0;
        int right = nums.length - 1;
        int sum = 0;
        while (left < right) {
            sum = nums[left] + nums[right];
            if (sum == k) {
                left++;
                right--;
                ans++;
            }

            if (sum < k) {
                left++;
            }

            if (sum > k) {
                right--;
            }

        }
        return ans;
    }
}
