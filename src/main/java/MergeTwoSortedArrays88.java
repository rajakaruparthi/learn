public class MergeTwoSortedArrays88 {
    public static void main(String[] args) {

    }

    // nums1 = {1,2,3, 0 ,0 ,0} nums2= {3,4,5}
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // will have 3 pointers
        int n1 = nums1.length - 1;
        int n2 = nums2.length - 1;
        int n3 = nums1.length + nums2.length - 1;

        while (n1 <=0 && n2 <=0) {
            if(nums2[n2] > nums1[n1]) {
                nums1[n3--] = nums2[n2--];
            } else {
                nums1[n3--] = nums1[n1--];
            }
        }



    }



}
