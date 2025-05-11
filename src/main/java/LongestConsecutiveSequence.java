import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;


public static void main(String[] args) {
    System.out.println(longest(new int[]{1, 100, 2, 3, 400, 4}));
}

private static int longest(int[] input) {

    Set<Integer> set = Arrays.stream(input).boxed().collect(Collectors.toSet());

    int longest = 0;
    int length = 0;

    for (int each : input) {
        if (!set.contains(each - 1)) {
            length = 0;
            while (set.contains(each + length)) {
                length++;
            }
            longest = Math.max(longest, length);
        }
    }

    return (longest);
}
