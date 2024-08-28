package leetcode75;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaxNumOfKPairs1679 {

    public static void main(String[] args) {
        MaxNumOfKPairs1679 maxNumOfKPairs1679 = new MaxNumOfKPairs1679();
        maxNumOfKPairs1679.maxOperations(new int[]{2, 2, 2, 3, 1, 1, 4, 1}, 4);
    }

    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int i = 0;

        Set<Integer> set = new HashSet<Integer>();

        for (int each : nums) {
            if (set.contains(k - each)) {
                i++;
                set.remove(k-each);
                set.remove(each);
            } else {
                set.add(each);
            }
        }

        return i;
    }
}
