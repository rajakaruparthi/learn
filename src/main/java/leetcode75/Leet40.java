package leetcode75;

public class Leet40 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int l1 = nums1.length;
            int l2 = nums2.length;
            int medianIndex1;
            int medianIndex2 = 0;
            int avg = (l1 + l2) / 2;
            boolean even = false;
            if ((l1 + l2) % 2 == 0) {
                even = true;
                medianIndex1 = avg - 1;
                medianIndex2 = avg;
            } else {
                medianIndex1 = avg;
            }

            int i = 0;
            l1 = l1 - 1;
            l2 = l2 - 1;
            int track = 0;
            int track1 = -9999999;
            int track2 = -9999999;

            if (even) {
                while (l1 >= 0 || l2 >= 0) {
                    if (l1 >= 0 && l2 >= 0 && nums1[l1] >= nums2[l2]) {
                        track = nums1[l1];
                        l1--;
                    } else if (l1 >= 0 && l2 >= 0 && nums1[l1] < nums2[l2]) {
                        track = nums2[l2];
                        l2--;
                    } else if (l1 >= 0 && l2 < 0) {
                        track = nums1[l1];
                        l1--;
                    } else if (l1 < 0) {
                        track = nums2[l2];
                        l2--;
                    }

                    if (medianIndex2 == i) {
                        track1 = track;
                    }

                    if (medianIndex1 == i) {
                        track2 = track;
                    }

                    if (track1 > -9999999 && track2 > -9999999) {
                        return (track1 + track2) * Math.pow(2, -1);
                    }
                    i++;

                }
            } else {
                while (l1 >= 0 || l2 >= 0) {
                    if (l1 >= 0 && l2 >= 0 && nums1[l1] >= nums2[l2]) {
                        track = nums1[l1];
                        l1--;
                    } else if (l1 >= 0 && l2 >= 0 && nums1[l1] < nums2[l2]) {
                        track = nums2[l2];
                        l2--;
                    } else if (l1 >= 0 && l2 < 0) {
                        track = nums1[l1];
                        l1--;
                    } else if (l1 < 0) {
                        track = nums2[l2];
                        l2--;
                    }

                    if (medianIndex1 == i) {
                        return track;
                    }
                    i++;
                }

            }
            return track;
    }


    public static void main(String[] args) {
//        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
//        System.out.println(findMedianSortedArrays(new int[]{}, new int[]{1}));
        System.out.println(findMedianSortedArrays(new int[]{}, new int[]{2, 3}));
//        System.out.println(findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }
}
