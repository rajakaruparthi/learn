import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstLastPosition {

    public static void main(String[] args) {

        int[] inp = new int[]{5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(iterate(inp, 8)));
    }

    private static int[] iterate(int[] input, int find) {

        List<Integer> out = new ArrayList<Integer>();
        int i = 0;
        int r = input.length - 1;

        while (i <= r) {

            int middle = (r + i) / 2;

            if (input[middle] == find) {
                out.add(input[middle]);
            }

            if (middle != 0 && input[middle - 1] < find) {

            } else {

            }

        }

        return new int[]{};
    }
}
