package Leetcode;

import java.util.*;

public class WordLadder {
    public static void main(String[] args) {
        SolutionL x = new SolutionL();
        String beginWord = "hit", endWord = "cog";
        String[] wordList =  {"hot","dot","dog","lot","log","cog"};
        List<String> w = new ArrayList<>(List.of(wordList));
        int res =x.ladderLength(beginWord, endWord, w);
        System.out.println(res);
    }
}
class SolutionL {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        if(beginWord == null || endWord == null || wordList == null || wordList.isEmpty()) {
            return 0;
        }
        if(beginWord.length() != endWord.length()) {
            return 0;
        }
        if(beginWord.equals(endWord)) {
            return 1;
        }

        Set<String> uWords = new HashSet<>(wordList);

        uWords.add(beginWord);

        if(!uWords.contains(endWord)){
            return 0;
        }

        Map<String, List<String>> adj = new HashMap<>();
        for(String w : uWords) {
            List<String> nbs = adj.computeIfAbsent(w, key -> new ArrayList<>());
            char[] word = w.toCharArray();
            for (int k = 0; k < word.length; k++) {
                char originalChar = word[k]; // Store original character
                for (char ch = 'a'; ch <= 'z'; ch++) {
//                    if (ch == originalChar) continue; // Optional: Skip replacing with the same character
                    word[k] = ch;
                    String ww = new String(word);
                    if (uWords.contains(ww)) {
                        nbs.add(ww);
                    }
                }
                word[k] = originalChar;
            }
        }
        Queue<String> q = new ArrayDeque<>();
        q.offer(beginWord);
        Set<String> vis = new HashSet<>();
        vis.add(beginWord);
        int res = 1;

        while (!q.isEmpty()) {
            int levelSize = q.size();
            for (int i = 0; i < levelSize; i++) {
                String word = q.poll();
                for (String s : adj.getOrDefault(word, Collections.emptyList())) {
                    if (s.equals(endWord)) {
                        return res + 1;
                    }
                    if (!vis.contains(s)) {
                        vis.add(s);
                        q.offer(s);
                    }
                }
            }
            res++;
        }
        return  0;

    }
}