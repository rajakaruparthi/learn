import java.util.ArrayList;
import java.util.List;

public class PrintSubArray {


    public static void printSubArray(int[] input, int currIndex) {

        if (currIndex == input.length)
            return;

        String result = "";
        List<Integer> o = new ArrayList<Integer>();
        for (int i = currIndex; i < input.length; i++) {
            o.add(input[i]);
            System.out.println(o);
        }
        printSubArray(input, currIndex + 1);
    }


    public static void main(String[] args) {
        printSubArray(new int[]{1, 2, 3, 4}, 0);
    }
}
