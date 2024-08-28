public class SumSubarryLessThanK {

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1, 1, 1}, 2));
    }

    public static int subarraySum(int[] nums, int k) {

        int sum = 0, out = 0, left = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum == k) {
                sum = sum - nums[left++];
            }
            out += right - left + 1;
        }
        return out;
    }
}
