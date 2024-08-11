import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4};
        System.out.println((removeDups(nums)));
    }


    private static int removeDups(int[] nums) {
        int j = 0;
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < nums.length - 1; i++) {
            if(!set.contains(nums[i])) {
                set.add(nums[i]);
                nums[set.size()-1] = nums[i];
            }
        }
        return set.size();
    }


    private static int remove(int[] nums) {
        int j=0;
        for (int i=0;i<nums.length;i++) {
            if(nums[j] != nums[i]) {
                j++;
                nums[j] = nums[i];
            }
        }

        return j+1;
    }
}
