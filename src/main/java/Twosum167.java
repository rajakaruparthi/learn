import java.util.Arrays;

public class Twosum167 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    private static int[] twoSum(int[] inp, int k) {
        int left = 0;
        int right = inp.length - 1;

        while (left != right) {
            if (inp[left] + inp[right] == k) {
                return new int[]{left + 1, right + 1};
            }

            if (inp[left] + inp[right] < k) {
                left++;
            } else {
                right--;
            }

        }
        return null;
    }
}



