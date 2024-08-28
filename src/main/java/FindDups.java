import java.util.ArrayList;
import java.util.List;

public class FindDups {

    public static void main(String[] args) {
        int[] inp = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(inp));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> out = new ArrayList<Integer>();
        int[] a = new int[100000];

        for (int num : nums) {
            a[num] = a[num] + 1;
            if (a[num] > 1) {
                out.add(num);
            }
        }
        return out;

    }


}
