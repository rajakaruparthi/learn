package leetcode75;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoveStart2390 {


    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
        System.out.println(removeStars("erase*****"));
    }

    public static String removeStars(String s) {

        Stack<Character> s1 = new Stack<>();

        for (int i=0; i< s.length(); i++) {
            if(s.charAt(i) != '*') {
                s1.push(s.charAt(i));
            } else {
                s1.pop();
            }
        }
        StringBuilder out = new StringBuilder();

        for (Character e : s1) {
            out.append(e);
        }

        return out.toString();
    }
}
