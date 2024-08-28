package leetcode75;

public class CanPlaceFlowers605 {

    public static void main(String[] args) {
        CanPlaceFlowers605 c = new CanPlaceFlowers605();
        System.out.println(c.canPlaceFlowers(new int[]{0, 0, 1, 0, 1}, 1));
        System.out.println(c.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 1}, 2));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if (flowerbed.length == 1) {
            return n == 1 && flowerbed[0] == 0;
        }

        if (flowerbed.length == 2) {
            return n == 1 && flowerbed[0] == 0 && flowerbed[1] == 0;
        }

        int next, pre = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                next = i == flowerbed.length - 1 ? 0 : flowerbed[i + 1];
                pre = i == 0 ? 0 : flowerbed[i - 1];
                if (pre == 0 && next == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }

        return n <= 0;
    }


}
