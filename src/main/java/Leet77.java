import java.util.ArrayList;
import java.util.List;

public class Leet77 {

    private static List<List<Integer>> resp = new ArrayList<>();
    private static List<Integer> currentCombination = new ArrayList<>();

    private static void backTrack(int ind, List<Integer> combination, int k, int n) {
        if (combination.size() == k) {
            resp.add(List.copyOf(combination));
        }

        for (int i = ind; i <= n; i++) {
            combination.add(i);
            backTrack(i + 1, combination, k, n);
            combination.removeLast();
        }
    }

    public static void main(String[] args) {
        int k = 2;
        int n = 4;
        combine(n, k);
    }

    private static void combine(int n, int k) {
        backTrack(1, currentCombination, 3, 5);
        System.out.println(resp);
    }

}
