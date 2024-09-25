package Fanfo;

import java.util.Arrays;
import java.util.List;

public class NullElement {
    public static void main(String[] args) {
//        int[] arr = new int[6];
//        arr[1] = 4;
////        arr[2] = null;
//        arr[5] = 5;
        int[] arr = {1, 4, 7, 98, 982, 21};
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, 3)));
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <= n; j++) {
               var x = Arrays.copyOfRange(arr, i, j);
                System.out.println(Arrays.toString(x));
            }

        }

//        System.out.println(Arrays.toString(arr));
    }
}
