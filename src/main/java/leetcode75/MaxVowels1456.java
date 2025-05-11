package leetcode75;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaxVowels1456 {

    public static void main(String[] args) {
        MaxVowels1456 maxVowels1456 = new MaxVowels1456();
        int i = maxVowels1456.maxVowels("abciiidef", 3);
        System.out.println(i);
    }


    public int maxVowels(String s, int k) {
        char[] a = s.toCharArray();
        Set<Character> vowels = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        int count = 0;
        int start = 0;
        int max = 0;

        for (int i = 0; i < a.length; i++) {
            if (vowels.contains(a[i])) {
                count++;
            }

            if (i - start + 1 == k) {
                max = Math.max(max, count);
                if (vowels.contains(a[start])) {
                    count--;
                }
                start = i - k + 2;
            }
        }


        return max;

    }
}
