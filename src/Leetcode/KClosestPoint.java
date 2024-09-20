package Leetcode;

import java.util.PriorityQueue;

public class KClosestPoint {
    public static void main(String[] args) {
//        Solution1 s = new Solution1();
//        int[][] first = {{1,3},{-2,2}};
//        int [][] second = {{3, 3}, {5, -1}, {-2, 4}};
//        s.kClosest(second, 2);
        SolutionX s = new SolutionX();
        int[] arr = {311155,311155,311155,311155,311155,311155,311155,311155,201191,311155};
        s.longestSubarray(arr);
    }
}
class Solution1 {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b)-> b[0]-a[0]);
        int[][] ret = new int[k][2];
        for(int[] point : points){
            int distance = point[0] * point[0] +  point[1] * point[1];
            int[] node = {distance, point[0], point[1]};
            maxHeap.offer(node);
            while(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        int i = 0;
        for(var point : maxHeap){
            ret[i++] = new int[]{point[1], point[2]};
        }

        return ret;
    }
}

class SolutionX {
    public int longestSubarray(int[] nums) {
        int max = -1;
        for(var num : nums) max = max > num ? max : num;
        int prev = -1;
        int currlen = 0;
        int maxlen = 0;
        for(var num : nums){
            if(num == max && prev != num){
                currlen = 1;
            } else if(num == max && prev == num){
                currlen++;

            }else{
                prev = num;
                currlen = 0;
            }
            maxlen =  maxlen > currlen ? maxlen : currlen;
        }
        return maxlen;
    }
}