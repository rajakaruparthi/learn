public class BubbleSort {

    private int[] bubbleSort(int[] input) {

        // loop through the
        int n = input.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    swap(j, j + 1, input);
                }
            }
        }
        return input;
    }

    private void swap(int j, int i, int[] input) {
        int temp = input[j];
        input[j] = input[i];
        input[i] = temp;
    }

    public static void main(String[] args) {
        int[] a = {2, 1, 5, 6, 3, 9, 7};
        BubbleSort bubbleSort = new BubbleSort();
        int[] out = bubbleSort.bubbleSort(a);
        for (int each : out) {
            System.out.print(each + " ");
        }
    }
}
