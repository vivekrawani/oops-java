package Leetcode;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int MOD = (int)(1e9 + 7);
        ArrayList<Integer> subArraySum = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int currSum = 0;
            for (int j = i; j < n; j++){
                currSum += nums[j];
                subArraySum.add(currSum);
            }
        }
        Collections.sort(subArraySum);
        int res = 0;
        for (int i = left - 1; i < right; i++) {
            res = (res +  subArraySum.get(i)) % MOD;
        }
        System.out.println(subArraySum);
        return res;
    }
}

public class RangeSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int  n = 4, left = 1, right = 10;
        Solution algo = new Solution();
        System.out.println(algo.rangeSum(nums, n, left, right));

    }
}
