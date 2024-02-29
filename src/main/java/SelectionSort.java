public class SelectionSort {

    private int[] selectionSort(int[] input) {

        int n = input.length;

        for (int i = 0; i < n; i++) {
            int currMin = input[i];
            int minIndex = i;
            for (int j = i; j < n; j++) {
                if (currMin > input[j]) {
                    currMin = input[j];
                    minIndex = j;
                }
            }
            swap(i, minIndex, input);
        }
        return input;
    }

    private void swap(int j, int i, int[] input) {
        int temp = input[j];
        input[j] = input[i];
        input[i] = temp;
    }

    public static void main(String[] args) {
        int[] input = {2, 1, 5, 3, 7, 4, 9, 6};
        SelectionSort selectionSort = new SelectionSort();
        int[] out = selectionSort.selectionSort(input);
        for (int each : out) {
            System.out.println(each + " ");
        }
    }
}
