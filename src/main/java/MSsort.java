//public class MSsort {
//
//    public static void main(String[] args) {
//        int[] inp = {1, 4, 2, 5, 3, 7, 8, 10, 9, 6};
//        divide(inp);
//
//    }
//
//    private static void divide(int[] inp) {
//        int inputLength = inp.length;
//
//        if (inputLength < 2) {
//            return;
//        }
//        int midIndex = inputLength / 2;
//
//        //
//        int[] leftArray = new int[midIndex];
//        int[] rightArray = new int[inputLength - midIndex];
//
//        for (int i = 0; i < leftArray.length; i++) {
//            leftArray[i] = inp[i];
//        }
//
//        for (int i = midIndex; i < inputLength; i++) {
//            rightArray[midIndex - i] = inp[i];
//        }
//
//        divide(leftArray);
//        divide(rightArray);
//
//        merge(inp, leftArray, rightArray);
//    }
//
//
//    private static int[] merge(int[] inp, int[] leftArray, int[] rightArray) {
//        int i = 0, j = 0, k = 0;
//        int leftSize = leftArray.length;
//        int rightSize = rightArray.length;
//        while (i < leftSize && j < rightSize) {
//            if(leftArray[i] < rightArray[j]) {
//                inp[k] = leftArray[i];
//                i++;
//            } else {
//                inp[k] = rightArray[j];
//                j++;
//            }
//            k++;
//        }
//
//
//    }
//}
