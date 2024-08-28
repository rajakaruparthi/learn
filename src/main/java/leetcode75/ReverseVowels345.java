package leetcode75;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowels345 {

    public static void main(String[] args) {
        ReverseVowels345 re = new ReverseVowels345();
//        System.out.println(re.reverseVowels("leetcode"));
//        System.out.println(re.reverseVowels(".,"));
        System.out.println(re.reverseVowels("race a car"));
    }

    public String reverseVowels(String s) {
        if(s.length() == 1) {
            return s;
        }


        Set<Character> vowels = new HashSet<Character>();

        Collections.addAll(vowels, 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        char[] ary = s.toCharArray();
        int left = 0;
        int right = ary.length - 1;

        while (left < right) {

            if (vowels.contains(ary[left]) && !vowels.contains(ary[right])) {
                right--;
            }

            if (!vowels.contains(ary[left]) && vowels.contains(ary[right])) {
                left++;
            }

            if (!vowels.contains(ary[left]) && !vowels.contains(ary[right])) {
                left++;
                right--;
            }

            if (vowels.contains(ary[left]) && vowels.contains(ary[right])) {
                char temp = ary[left];
                ary[left] = ary[right];
                ary[right] = temp;
                right--;
                left++;
            }

        }
        StringBuilder o = new StringBuilder();

        for (char c : ary) {
            o.append(c);
        }

        return o.toString();
    }
}
