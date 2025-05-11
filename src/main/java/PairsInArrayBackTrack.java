
import java.util.ArrayList;
import java.util.List;

public class PairsInArrayBackTrack {

    public static void printUniquePairs(int[] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n];
        List<List<Integer>> pairs = new ArrayList<List<Integer>>();

        backtrack(arr, visited, new ArrayList<Integer>(), pairs);

        for (List<Integer> pair : pairs) {
            System.out.println(pair);
        }
    }

    private static void backtrack(int[] arr, boolean[] visited, List<Integer> currPair, List<List<Integer>> pairs) {
        if (currPair.size() == arr.length) {
            pairs.add(new ArrayList<Integer>(currPair));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                currPair.add(arr[i]);
                backtrack(arr, visited, currPair, pairs);
                currPair.remove(currPair.size() - 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        printUniquePairs(arr);
    }
}
