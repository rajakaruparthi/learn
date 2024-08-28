import java.util.Arrays;
import java.util.List;

public class DistanceBetweenTwoPoints {

    public static void main(String[] args) {
        List<List<Integer>> inp = Arrays.asList(Arrays.asList(-1, 1), Arrays.asList(-3,1,4), Arrays.asList(-2,-1,0,2));
        System.out.println(maxDistance(inp));
    }

    public static int maxDistance(List<List<Integer>> arrays) {

        int max = 0;

        if (arrays.size() == 2) {
            int d1 = arrays.get(0).get(0) - arrays.get(1).get(arrays.get(1).size());
            int d2 = arrays.get(1).get(0) - arrays.get(0).get(arrays.get(0).size());
            if (d2 < 0) {
                d2 = -d2;
            }

            if (d1 < 0) {
                d1 = -d1;
            }

            max = Math.max(max, Math.max(d1, d2));
        }


        if (arrays.size() > 2) {
            for (int i = 0; i < arrays.size() - 1; i++) {
                for (int j = i + 1; j < arrays.size() ; j++) {
                    int d1 = arrays.get(i).get(0) - arrays.get(j).get(arrays.get(j).size() - 1);
                    int d2 = arrays.get(i).get(arrays.get(i).size() - 1) - arrays.get(j).get(0);

                    if (d2 < 0) {
                        d2 = -d2;
                    }

                    if (d1 < 0) {
                        d1 = -d1;
                    }

                    max = Math.max(max, Math.max(d1, d2));
                }
            }
        }

        return max;
    }

}
