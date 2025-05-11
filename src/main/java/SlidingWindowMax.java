import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMax {


    public static void main(String[] args) {

    }

    private int[] max(int[] nums, int k) {
        int left = 0;
        int right = k - 1;
        int[] max = new int[nums.length - k + 1];
        int maxIndex = 0;
        Deque<Integer> window = new ArrayDeque<>();

        for (int i = 0; i < k; i++) {
            max[0] = Math.max(max[0], nums[i]);
            window.add(nums[i]);
        }

        while (right < nums.length - 1) {


            right++;
        }

        return null;
    }
}
