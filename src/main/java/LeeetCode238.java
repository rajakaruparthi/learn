import java.util.Arrays;

public class LeeetCode238 {

    public static void main(String[] args) {
        product(new int[]{1, 2, 3, 4, 5});
        product(new int[]{1, 2, 3});
    }

    private static int[] product(int[] input) {

        if (input.length < 2) {
            return input;
        }

        int[] fromLeft = new int[input.length];
        int[] fromRight = new int[input.length];

        fromLeft[0] = 1;
        fromRight[input.length - 1] = 1;
        int prod = 1;
        for (int i = 1; i < input.length; i++) {
            prod = input[i - 1] * prod;
            fromLeft[i] = prod;
        }

        prod = 1;

        for (int i = input.length - 1; i > 0; i--) {
            prod = prod * input[i];
            fromRight[i - 1] = prod;
        }

        System.out.println(Arrays.toString(fromLeft));

        System.out.println(Arrays.toString(fromRight));

        for (int i = 0; i < input.length; i++) {
            fromLeft[i] = fromLeft[i] * fromRight[i];
        }

        System.out.println(Arrays.toString(fromLeft));

        return fromLeft;
    }
}
