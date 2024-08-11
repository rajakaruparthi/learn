import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Triplets {

    public static void main(String[] args) {
        checkSum(Arrays.asList(1, 2, 3, -3));
    }

    private static List<List<Integer>> checkSum(List<Integer> ints) {
        if (ints.size() == 3) {
            if (sum(ints) == 0) {
                return Collections.singletonList(ints);
            }
        }

        for (int i = 0; i < ints.size(); i++) {

        }

        return null;
    }

    private static int sum(List<Integer> ints) {
        int sum = 0;
        for (Integer each : ints) {
            sum = sum + each;
        }
        return sum;
    }
}
