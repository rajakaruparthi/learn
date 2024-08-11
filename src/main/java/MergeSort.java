import java.util.Random;

public class MergeSort {

    public static void main(String[] args) {
        int[] input = getRandomInts(11);

        System.out.println("Before::");
        for (int each : input) {
            System.out.println(each);
        }

        divide(input);

        System.out.println("After:: ");
        for (int each : input) {
            System.out.println(each);
        }
    }

    private static void divide(int[] inputArray) {
        int inputLength = inputArray.length;

        if (inputLength < 2) {
            return;
        }
        int midIndex = inputLength / 2;
        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[inputLength - midIndex];

        System.arraycopy(inputArray, 0, leftArray, 0, midIndex);
        System.arraycopy(inputArray, midIndex, rightArray, 0, inputLength - midIndex);

        divide(leftArray);
        divide(rightArray);

        merge(inputArray, leftArray, rightArray);
    }

    private static void merge(int[] inputAry, int[] leftAry, int[] rightAry) {
        int i = 0, j = 0, k = 0;
        int leftSize = leftAry.length;
        int rightSize = rightAry.length;

        while (i < leftSize && j < rightSize) {
            if (leftAry[i] < rightAry[j]) {
                inputAry[k] = leftAry[i];
                i++;
            } else {
                inputAry[k] = rightAry[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            inputAry[k] = leftAry[i];
            k++;
            i++;
        }

        while (j < rightSize) {
            inputAry[k] = rightAry[j];
            k++;
            j++;
        }

    }


    private static int[] getRandomInts(int max) {
        int[] in = new int[max];
        Random random = new Random();
        for (int i = 0; i < max; i++) {
            in[i] = (random.nextInt(1000));
        }
        return in;
    }

}
