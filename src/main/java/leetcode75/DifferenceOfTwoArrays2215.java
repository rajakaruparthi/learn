package leetcode75;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DifferenceOfTwoArrays2215 {

    public static void main(String[] args) {
        DifferenceOfTwoArrays2215 differenceOfTwoArrays2215 = new DifferenceOfTwoArrays2215();
        List<List<Integer>> out = differenceOfTwoArrays2215.findDifference(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2});
        System.out.println(out);
    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> out = new ArrayList<>();

        int leftArrayIndex = 0;
        int rightArrayIndex = 0;


        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        Set<Integer> isPresent = new HashSet<>();

        while (leftArrayIndex < nums1.length - 1 && rightArrayIndex < nums2.length - 1) {

            if (nums1[leftArrayIndex] < nums2[rightArrayIndex]) {
                if (!isPresent.contains(nums1[leftArrayIndex])) {
                    left.add(nums1[leftArrayIndex]);
                }
                leftArrayIndex++;
            } else if (nums1[leftArrayIndex] > nums2[rightArrayIndex]) {
                if(!isPresent.contains(nums2[rightArrayIndex])) {
                    right.add(nums2[rightArrayIndex]);
                }
                rightArrayIndex++;
            } else {
                isPresent.add(nums1[leftArrayIndex]);
                leftArrayIndex++;
                rightArrayIndex++;
            }
        }


        if (rightArrayIndex != nums2.length) {
            while (rightArrayIndex < nums2.length) {
                if (!isPresent.contains(nums2[rightArrayIndex])) {
                    right.add(nums2[rightArrayIndex]);
                }
                rightArrayIndex++;
            }
        }

        if (leftArrayIndex != nums1.length) {
            while (leftArrayIndex < nums1.length) {
                if (!isPresent.contains(nums1[leftArrayIndex])) {
                    left.add(nums1[leftArrayIndex]);
                }
                leftArrayIndex++;
            }
        }

        out.add(left);
        out.add(right);

        return out;

    }
}
