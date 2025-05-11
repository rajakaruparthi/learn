public class SortColorsLeet75 {



    private static void sort(int[] inp) {
        int zero = 0, one = 0, two = 0;

        for (int j : inp) {
            if (j == 0) {
                zero++;
            }
            if (j == 1) {
                one++;
            }
            if (j == 2) {
                two++;
            }
        }

        int i = 0;
        while (zero != 0) {
            inp[i] = 0;
            i++;
            zero--;
        }
        while (one != 0) {
            inp[i] = 1;
            i++;
            one--;
        }
        while (two != 0) {
            inp[i] = 2;
            i++;
            two--;
        }
    }
}
