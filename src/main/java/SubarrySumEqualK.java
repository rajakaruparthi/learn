import java.util.HashMap;
import java.util.Map;

public class SubarrySumEqualK {

    public static void main(String[] args) {
        int out = compute(new int[]{1, -1, 1, 1, 1, 1}, 3);
        System.out.println(out);
    }

    private static int compute(int[] input, int k) {
        int sum = 0;
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int e : input) {
            sum += e;

            if (map.containsKey(sum - k)) {
                res += map.get(sum - k);
            } else {
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
            System.out.println(map);
        }
        return res;

    }
}
