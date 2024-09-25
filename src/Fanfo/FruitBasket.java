package Fanfo;

import java.util.*;

public class FruitBasket {

    public static void main(String[] args) {
        int[] arr = {3, 3,3, 1, 2, 1, 1, 2, 3, 3, 4};
        int result = findMaxFruits(arr);
        System.out.println(result);
    }

    private static int findMaxFruits(int[] arr) {

       /*
        * Wrong approach as sub-array should be continuous
        *  Map<Integer, Integer> mp = new TreeMap<>((a, b)-> b- a);
        for (int item : arr){
            mp.put(item, 1+ mp.getOrDefault(item, 0));

        }
        int t = 2;
        for(Integer val : mp.values()){
            res += val;
            t--;
            if(t == 0){
                break;
            }
        }
        */
        int res = 0;
        // we need to find continuous sub-array having atmost 2 unique element
        // brute force generate all sub-array
        int N = arr.length;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {

            Set<Integer> uni = new HashSet<>();
            List<Integer> list = new ArrayList<>();
            int sum = 0;
            for (int j = i; j < N; j++) {
                uni.add(arr[j]);
                list.add(arr[j]);
                if(uni.size()<= 2){
                    sum += arr[j];
                    max = Math.max(max, sum);
                    System.out.println("sum " + sum);

                }
                System.out.println("set " + uni.size());
                System.out.println("list " + list);

            }
        }
//        int sum = 0;
//        Map<Integer, Integer> table = new HashMap<>();
//        for (int right = 0; right < N; right++) {
//            sum += arr[right];
//            table.put
//        }



        return max;
    }
}
