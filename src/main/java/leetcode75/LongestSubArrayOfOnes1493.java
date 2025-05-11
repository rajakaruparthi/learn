package leetcode75;

public class LongestSubArrayOfOnes1493 {

//    Longest Subarray of 1's After Deleting One Element

    // [0,1,1,1,0,1,1,0,1]
    // left == 0, right == 0  (if(right == 0) { delete right++ left++}

    public int longestSubarray(int[] nums) {
        int max = 0;
        int zeroCount = 0;
        int left = 0;
        int right = 0;


        while (right < nums.length) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            right++;
        }


        return max;
    }

    public static void main(String[] args) {

    }

}
