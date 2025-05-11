package leetcode75;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurance1207 {

    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (int each : arr) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }

        for (Integer each : map.keySet()) {
            if (!set.add(map.get(each))) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        UniqueOccurance1207 uniqueOccurance1207 = new UniqueOccurance1207();
        boolean b = uniqueOccurance1207.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3});
        boolean c = uniqueOccurance1207.uniqueOccurrences(new int[]{1, 2});
        System.out.println(c);
        System.out.println(b);
    }
}
