package Leetcode;

import java.util.*;

public class Keypad2 {
    public int minimumPushes(String word) {
    int res  = 0;
    int[] fre = new int[26];
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            fre[ch-'a']++;
        }
        Arrays.sort(fre);
        int j = 0;
        for (int i = 25; i >= 0 ; i--) {
            if(fre[i]!= 0){
                res += (fre[i] * (1 +  j / 8));
                j++;
            }else{
                break;
            }
        }
    return res;
    }
}
