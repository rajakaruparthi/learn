package leetcode75;

public class FindPivot724 {

    public static void main(String[] args) {

        FindPivot724 findPivot724 = new FindPivot724();
//        int i = findPivot724.pivotIndex(new int[]{1, 7, 3, 6, 5, 6});
//        System.out.println(findPivot724.pivotIndex(new int[]{1, 2, 3}));
//        System.out.println(findPivot724.pivotIndex(new int[]{2, -1, 1}));
        System.out.println(findPivot724.pivotIndex(new int[]{-1, -1, -1, -1, -1, -1}));
//        System.out.println(i);
    }

    public int pivotIndex(int[] nums) {

        // 1,7,3,6,5,6
        int left = 0;
        int right = nums.length - 1;

        int rightSum = 0;
        int leftSum = 0;

        int sum = 0;

        for (int i =0; i< nums.length; i++) {
            sum = sum + nums[i];
        }

        boolean b = true;

       /* while (right > left) {

            if (rightSum > leftSum) {
                left++;
                leftSum = leftSum + nums[left];
            }

            if (leftSum > rightSum) {
                right--;
                rightSum = rightSum + nums[right];
            }

            if (rightSum == leftSum) {
                if (right - left == 2) {
                    return right - 1;
                }

                if (right - left == 1) {
                    return -1;
                }
            }
        }*/


       for (int i=0; i< nums.length; i++) {

       }

        return 0;
    }
}
