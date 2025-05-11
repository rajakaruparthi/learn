package leetcode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode120 {

    public static int minimumTotal(List<List<Integer>> triangle) {
        int[] cal = new int[triangle.getLast().size() + 1];
        // triangle.length = 4
        // cal.length = 5

        if (triangle.size() == 1) {
            return triangle.getFirst().getFirst();
        }

        int sumIndex = cal.length - 1;
        // sumIndex starts from 4

        // first get the last initial array of the declared array

        while (sumIndex > 0) {
            List<Integer> tempList = triangle.get(sumIndex - 1);
            for (int k = 0; k < (sumIndex); k++) {
                cal[k] = Math.min(tempList.get(k) + cal[k], tempList.get(k) + cal[k + 1]);
            }
            sumIndex--;
        }

        return cal[0];
    }

    public static void main(String[] args) {
        minimumTotal(List.of(List.of(2), Arrays.asList(3, 4), Arrays.asList(6, 5, 7), Arrays.asList(4, 1, 8, 3)));
    }
}
