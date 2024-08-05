package templates;
import java.io.*;
import java.util.*;

class Solution {

    Vector<Integer> generateNextPalindrome(int nums[], int n) {
        // code here
        Vector<Integer> res = new Vector<>();
        Stack<Integer> ds = new Stack<>();

        int carry = 1;
        int p = (n - 1) / 2;
        //System.out.println(nums[p]);
        for (int i = (n - 1) / 2; i >= 0; i--) {
            int sum = nums[i] + carry;
            System.out.println(sum);
            ds.push(sum % 10);
            carry = sum / 10;
           
        }
        if (carry != 0)
            res.add(carry);
        System.out.println(ds.toString());
        while (!ds.isEmpty()) {
            res.add(ds.pop());
        }
        int k = res.size();
        if (n % 2 == 1)
            k--;
        for (int i = k - 1; i >= 0; i--) {
            res.add(res.get(i));
        }
        return res;
    }
}

public class Question17 {
    public static void main(String[] args) throws Exception {
        // BufferedReader br =
        // new BufferedReader(new InputStreamReader(System.in));
        // int t = Integer.parseInt(br.readLine().trim());
        // while (t-- > 0) {
        // int n = Integer.parseInt(br.readLine().trim());
        // int num[] = new int[n];
        // String[] str = br.readLine().trim().split(" ");
        // for (int i = 0; i < n; i++) {
        // num[i] = Integer.parseInt(str[i]);
        // }
        int num[] = {9, 4, 1, 8, 7, 9, 7, 8, 3, 2, 2};
        int n = 11;

        Vector<Integer> ans = new Solution().generateNextPalindrome(num, n);
        for (Integer x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
        // }
        // }
    }
}
