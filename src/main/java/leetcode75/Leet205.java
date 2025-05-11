package leetcode75;

import java.util.HashMap;
import java.util.Map;

public class Leet205 {

    public static void main(String[] args) {
        System.out.println(isIsoMorphic("title", "paper"));
        System.out.println(isIsoMorphic("add", "foo"));
        System.out.println(isIsoMorphic("egg", "add"));
        System.out.println(isIsoMorphic("foo", "bar"));
    }


    private static boolean isIsoMorphic(String s1, String s2) {
        Map<Character, Character> map = new HashMap<>();

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] second = s2.toCharArray();
        char[] first = s1.toCharArray();

        for (int i = 0; i < first.length; i++) {
            if (map.containsKey(first[i])) {
                boolean equals = map.get(first[i]).equals(second[i]);
                if (!equals) {
                    return false;
                }
            }
            map.put(first[i], second[i]);
        }

        map = new HashMap<>();

        for (int i = 0; i < first.length; i++) {
            if (map.containsKey(second[i])) {
                boolean equals = map.get(second[i]).equals(first[i]);
                if (!equals) {
                    return false;
                }
            }
            map.put(second[i], first[i]);
        }
        return true;
    }
}
