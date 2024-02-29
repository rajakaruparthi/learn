public class HopsToEnd {


    private static boolean isReachedEnd(int[] input) {

        int lastIndex = input.length - 1;

        int startIndex = 0;

        while (startIndex != -1) {

            int currentPosition = startIndex;

            startIndex = input[currentPosition];

            if (startIndex > lastIndex) {
                return false;
            }

            currentPosition = currentPosition + startIndex;

            startIndex = currentPosition;

            if (currentPosition == lastIndex) {
                return true;
            }

            if (input[startIndex] == 0) {
                return false;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isReachedEnd(new int[]{3, 1, 1, 1}));
    }
}
