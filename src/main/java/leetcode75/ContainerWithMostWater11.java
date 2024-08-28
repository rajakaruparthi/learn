package leetcode75;

public class ContainerWithMostWater11 {

    public static void main(String[] args) {

        ContainerWithMostWater11 c = new ContainerWithMostWater11();
        System.out.println(c.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public int maxArea(int[] height) {

        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        int calculatedArea = 0;

        while (left <= right) {
            if (height[left] >= height[right]) {
                calculatedArea = (right - left) * (Math.min(height[right], height[left]));
                right--;
            } else {
                calculatedArea = (right - left) * (Math.min(height[right], height[left]));
                left++;
            }
            if (maxArea < calculatedArea) {
                maxArea = calculatedArea;
            }
        }

        return maxArea;

    }
}
