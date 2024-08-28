package leetcode75;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestCandles1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> e = new ArrayList<Boolean>();
        int max = 0;

        for (int candy : candies) {
            if (max < candy) {
                max = candy;
            }
        }

        for (int i = 0; i < candies.length; i++) {
            e.add(i, extraCandies + candies[i] >= max);
        }

        return e;
    }

    public static void main(String[] args) {
        KidsWithGreatestCandles1431 kidsWithGreatestCandles1431 = new KidsWithGreatestCandles1431();
        System.out.println(kidsWithGreatestCandles1431.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
    }
}
