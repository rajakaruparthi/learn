package leetcode75;

import java.util.HashSet;
import java.util.Set;

public class Leet128 {

    public static void main(String[] args) {
        System.out.println(maxSequence(new int[]{100, 200, 1, 2, 3, 4}));
    }

    private static int maxSequence(int[] inp) {
        Set<Integer> set = new HashSet<>();
        for (int each : inp) {
            set.add(each);
        }

        boolean checkIfStart;
        int max = 0;
        int cal = 1;
        int temp;
        for (int e : inp) {
            checkIfStart = !set.contains(e - 1);
            if (checkIfStart) {
                temp = e;
                while (set.contains(temp + 1)) {
                    temp = temp + 1;
                    cal = cal + 1;
                    max = Math.max(max, cal);
                }
                cal = 1;
            }
        }

        return max;
    }
}
