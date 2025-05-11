package leetcode75;

import java.util.Arrays;

public class Leet34 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 8, 8, 9}, 8)));
        System.out.println(Arrays.toString(searchRange(new int[]{2, 2}, 2)));
//        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)));
    }

    // 5.7.7.8.8.9
    private static int[] searchRange(int[] inp, int k) {

        if (inp.length == 1 && inp[0] == k) {
            return new int[]{0, 0};
        }
        int l = 0;
        int r = inp.length - 1;
        int mid = (l + r) / 2;

        while (l < r) {

            if (inp[mid] > k) {
                r = mid - 1;
            } else if (inp[mid] < k) {
                l = mid + 1;
            }

            mid = (l + r) / 2;

            if (inp[mid] == k) {
                l = mid;
                while ((l >= 0 && inp[l] == k)) {
                    l = l - 1;
                }

                while ((r < inp.length && inp[r] == k)) {
                    r = r + 1;
                }
                return new int[]{l + 1, r - 1};
            }
        }

        return new int[]{-1, -1};

    }
}
