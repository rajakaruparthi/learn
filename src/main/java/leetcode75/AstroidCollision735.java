package leetcode75;

import java.util.Stack;

public class AstroidCollision735 {

    public static int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> s = new Stack<>();

        for (int asteroid : asteroids) {

            if (s.isEmpty()) {
                s.push(asteroid);
            } else if (asteroid > 0) {
                s.push(asteroid);
            } else if (asteroid < 0) {
                Integer peek = s.peek();
                while (!s.isEmpty() && (peek > 0 && -(peek) >= asteroid)) {
                    peek = s.peek();
                    s.pop();
                }
            }
        }

        int[] out = new int[s.size()];

        for (int i = 0; i < s.size(); i++) {
            out[i] = s.get(i);
        }

        return out;
    }

    public static void main(String[] args) {
        int[] ints = null;
        ints = asteroidCollision(new int[]{5, 5, -5});

        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
    }
}
