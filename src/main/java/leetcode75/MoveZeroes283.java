package leetcode75;

public class MoveZeroes283 {

    public static void main(String[] args) {

        MoveZeroes283 moveZeroes283 = new MoveZeroes283();
        moveZeroes283.moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

    public int[] moveZeroes(int[] nums) {
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[p];
                nums[p] = temp;
                p++;
            }
        }
        return nums;
    }
}
