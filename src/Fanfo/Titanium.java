package Fanfo;

import java.util.*;

public class Titanium {
    public static void main(String[] args) {
//        List<List<Integer>> mat = new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
//            mat.add(new ArrayList<>());
//            for (int j = 0; j < 3; j++) {
//                int num = (int) (Math.random() * 100 ) ;
//                mat.get(i).add(num);
//            }
//        }
//        System.out.println(mat);
//        Comparator<List<Integer>> lambda = (a, b)-> a.get(2)-b.get(2);
//        mat.sort(lambda);
//        System.out.println(mat);
//        int[] arr = {1, 4, 7, 8, 9};
//        int[] brr = arr.clone();
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(brr));
        String s = "leet**cod*e";
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()){
            if(ch == '*'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else {
                stack.push(ch);
            }
        }


    }
}
