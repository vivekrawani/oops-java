package templates;
public class Question {
    public static void main(String[] args) {
        int a[] = {8,7,4};
        int b[] = {13,4,4};
        for(int i : a)
        System.out.println(i + " ");
        System.out.println(maxNonDecreasingLength(a, b));
    }
    public static int maxNonDecreasingLength(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int len = 1;
        int prev = nums1[0] < nums2[0] ? nums1[0] : nums2[0];
        for(int i = 1; i < n; i++){
            int min = nums1[i] < nums2[i] ? nums1[i] : nums2[i];
            int max = nums1[i] > nums2[i] ? nums1[i] : nums2[i];
            if(prev > max) break;
            else if(prev > min) {
                prev = max;
                len++;
            } else {
                prev = min;
                len++;
            }
        }
        return len;
    }
}
