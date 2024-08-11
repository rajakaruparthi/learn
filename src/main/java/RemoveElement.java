public class RemoveElement {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 1, 2, 3, 4, 5};
        int inp = 1;
        System.out.println(removeAnElement(nums, inp));
        System.out.println("----");
        printNums(nums);
    }

    private static int removeAnElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    private static void printNums(int[] nums) {
        for (int e : nums) {
            System.out.println(e);
        }
    }
}

