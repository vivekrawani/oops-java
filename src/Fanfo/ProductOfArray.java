package Fanfo;

import java.util.Arrays;

public class ProductOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4 };
        int[] res = productExceptSelf(arr);
    }

    private static int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] prefix = new int[N];
        int[] suffix = new int[N];
        Arrays.fill(prefix, 1);
        Arrays.fill(suffix, 1);
        for(int i = 1; i < N; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
            suffix[N - i -1] = suffix[N - i] * nums[N - i];
        }
        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(suffix));
        int[] res = new int[N];
        for (int i = 0; i < N; i++) {
            res[i] = suffix[i] * prefix[i];
        }
        return res;
    }
}
