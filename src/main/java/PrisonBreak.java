import java.util.ArrayList;
import java.util.List;


public class PrisonBreak {

    private int prison(int n, int m, int[] h, int[] v) {
        List<Integer> horizontalInitialArray = getList(n);
        List<Integer> verticalInitialArray = getList(m);
        List<Integer> modifiedHorizontalAry = getModifiedAry(horizontalInitialArray, h);
        shiftZeros(modifiedHorizontalAry);
        System.out.println(modifiedHorizontalAry);
        List<Integer> modifiedVerticalAry = getModifiedAry(verticalInitialArray, v);
        shiftZeros(modifiedVerticalAry);
        System.out.println(modifiedVerticalAry);
        return getMaximumArea(modifiedHorizontalAry, modifiedVerticalAry);
    }

    private int getMaximumArea(List<Integer> modifiedHorizontalAry, List<Integer> modifiedVerticalAry) {
        int max = 0;
        for (Integer each: modifiedHorizontalAry) {
            for (int verticalVal : modifiedVerticalAry) {
                if (max < each * verticalVal) {
                    max = each * verticalVal;
                }
            }
        }
        return max;
    }

    private void shiftZeros(List<Integer> modifiedArray) {
        for (int i = 0; i < modifiedArray.size(); i++) {
            if (modifiedArray.get(i).equals(0)) {
                modifiedArray.remove(i--);
            }
        }
    }

    private List<Integer> getModifiedAry(List<Integer> initialArray, int[] h) {
        for (int value : h) {
            int index = value;
            initialArray.set(index, 0);
            while (initialArray.get(--index) == 0) {
//                index = index;
            }
            initialArray.set(index, initialArray.get(index) + 1);
        }
        return initialArray;
    }

    private List<Integer> getList(int n) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n+1; i++){
            list.add(1);
        }
        return list;
    }

    public static void main(String[] args) {
        PrisonBreak pb = new PrisonBreak();
        int n = 5;
        int m = 5;
        int[] h = {2, 3};
        int[] v = {3, 5};
        int maxArea = pb.prison(n,m,h,v);
        System.out.println(maxArea);
    }
}
