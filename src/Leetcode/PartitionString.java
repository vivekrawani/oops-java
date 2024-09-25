package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class PartitionString {
    public static void main(String[] args) {
        String input = "abacaba";
        Set<Character> st = new HashSet<>();
        int res = 1;

        for(char ch : input.toCharArray()){
            if(st.contains(ch)){
                res += 1;
                st.clear();
                st.add(ch);

            } else{
                st.add(ch);

            }
        }
        System.out.println(res);
    }
}
