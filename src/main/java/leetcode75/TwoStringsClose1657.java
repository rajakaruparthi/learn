package leetcode75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoStringsClose1657 {


    public static boolean closeStrings(String word1, String word2) {

        if (!(word1.length() == word2.length())) {
            return false;
        }

        Map<Character, Integer> e = new HashMap<>();
        Map<Character, Integer> e1 = new HashMap<>();

        char[] w1 = word1.toCharArray();
        Arrays.sort(w1);

        char[] w2 = word2.toCharArray();
        Arrays.sort(w2);

        for (int i = 0; i < w1.length; i++) {
            if (e.containsKey(w1[i])) {
                e.put(w1[i], e.get(w1[i]) + 1);
            } else {
                e.put(w1[i], 1);
            }

            if (e1.containsKey(w2[i])) {
                e1.put(w2[i], e1.get(w2[i]) + 1);
            } else {
                e1.put(w2[i], 1);
            }
        }

        if (e.size() != e1.size()) {
            return false;
        }


        Integer[] a = e.values().toArray(new Integer[0]);
        Integer[] b = e1.values().toArray(new Integer[0]);

        for (char c1 : e.keySet()) {
            if (!e1.containsKey(c1)) {
                return false;
            }
        }


        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(closeStrings("cabbbb", "abbccc"));
    }
}
