import java.util.HashMap;
import java.util.Map;

public class Leetcode560 {


    public static void main(String[] args) {
//        System.out.println(subArrayCount(new int[]{1, 1, 1}, 2));
//        System.out.println(subArrayCount(new int[]{1, 2, 3}, 3));
//        System.out.println(subArrayCount(new int[]{1, -1, 1, 1, 1, 1}, 3));
        System.out.println(subArrayCount(new int[]{-1,-1,1}, 0));
    }

    private static int subArrayCount(int[] inp, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int diff = 0;

        for (int each : inp) {
            sum += each;
            diff = sum - k;
            if (map.containsKey(diff)) {
                count += map.get(diff);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println(map);
        return count;
    }
}
