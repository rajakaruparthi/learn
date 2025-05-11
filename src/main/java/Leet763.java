import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leet763 {

    public static void main(String[] args) {
        cal("ababcbacadefegdehijhklij");
    }

    private static void cal(String inp) {

        // ababcbacadefegdehijhklij
        List<Integer> out = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        int index = 0;
        for (char e : inp.toCharArray()) {
            map.put(e, index);
            index++;
        }
        // now the map has last index of each character
        int max = 0;
        int sum = 0;
        index = 0;

        for (char e : inp.toCharArray()) {
            sum++;
            max = Math.max(max, map.get(e));
            if (max == index) {
                out.add(sum);
                sum = 0;
            }

            index++;
        }

        System.out.println(out);
    }

}
