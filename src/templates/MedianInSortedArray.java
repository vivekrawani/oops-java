package templates;
public class MedianInSortedArray {
    public static void main(String[] args) {
        int b[] = { };
        int a[] = { 1, 3 };
        
        // 1 3 4 5 || 6 7 9 10 25
        // 1 5 || 6 9 25
        // 3 4 || 7 10

        // 1 3 4 5 6 || 7 9 10 25 29
        // 1 5 6 || 9 25
        // 3 4 || 7 10 29

        double res = findMedianSortedArrays(a, b);
        System.out.println(res);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length < nums2.length) {
            return findMedian(nums1, nums2);

        } else {
            return findMedian(nums2, nums1);

        }
    }

    private static double findMedian(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        int left = 0;
        int right = nums1.length - 1;
        int half = total / 2;

        while (left <= right) {
            int mid = (left + right) / 2;
            int index1 = mid - 1;
            int index2 = (half - mid) - 1;

            int leftA = (index1 < 0) ? Integer.MIN_VALUE : nums1[index1];
            int leftB = (index2 < 0) ? Integer.MIN_VALUE : nums2[index2];
            int rightA = (index1 + 1 >= nums1.length) ? Integer.MAX_VALUE : nums1[index1 + 1];
            int rightB = (index2 + 1 >= nums2.length) ? Integer.MAX_VALUE : nums2[index2 + 1];

            if (leftA <= rightB && leftB <= rightA) {
                // odd
                if (total % 2 == 1) {
                    return Math.min(rightA, rightB);
                } else {
                    return (Math.min(rightA, rightB) + Math.max(leftA, leftB)) / 2.0;
                }

            } else if (leftB > rightA)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return 0.0;
    }
}
