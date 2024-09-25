package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestStringUnique {
    public static int lengthOfLongestSubstring(String s) {

        Set<Character> substringL = new HashSet<>();
        int largestlength = 0;
        for(int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            // get the index of the char
            substringL.remove(ch);
            substringL.clear();
            substringL.add(ch);
            largestlength = Math.max(largestlength, substringL.size());
        }
        return largestlength;

    }
    public static void main(String[] args) {
        int res = lengthOfLongestSubstring("pwwkew");
        System.out.println(res);
    }
}
