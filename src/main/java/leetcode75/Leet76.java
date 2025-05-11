package leetcode75;

import java.util.HashMap;
import java.util.Map;

public class Leet76 {

    public static void main(String[] args) {
        System.out.println(minSubstring("ADOBECODEBANC", "ABC"));
        System.out.println(minSubstring("a", "aa"));
        System.out.println(minSubstring("a", "a"));
        System.out.println(minSubstring("ab", "b"));
    }

    private static String minSubstring(String input, String t) {
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }

        boolean found = false;
        String minString = "ADOBECODEBANC";

        if (input.length() == 1) {
            return input.equals(t) ? t : "";
        }

        int l = 0;
        int r = 0;

        String sub = "";
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> tempCopy = (HashMap<Character, Integer>) tMap.clone();

        while (input.length() - l > t.length()) {
            found = calculate(tempCopy, input.charAt(r));
            if (found) {
                tempCopy = (HashMap<Character, Integer>) tMap.clone();
                sb = new StringBuilder(input.substring(l, r + 1));
                l++;
                minString = findMinString(minString, sb.toString());
            } else if (r < input.length() - 1) {
                sb.append(input.charAt(r));
                r++;
            }
        }
        return minString;
    }

    private static boolean calculate(Map<Character, Integer> tMap, Character check) {
        int sum = 0;
        if (tMap.containsKey(check)) {
            tMap.put(check, tMap.get(check) - 1);
        }
        for (Map.Entry<Character, Integer> t : tMap.entrySet()) {
            sum = sum + t.getValue();
        }
        return sum == 0;
    }


    private static String findMinString(String s1, String s2) {
        return s1.length() < s2.length() ? s1 : s2;
    }


}
