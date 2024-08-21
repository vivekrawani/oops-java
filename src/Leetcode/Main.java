package Leetcode;

public class Main {
    public static void main(String[] args) {
        Basketball b1 = new Basketball();
        String[] test1 = {"5","2","C","D","+"};
//        int res = b1.calPoints(test1);
//        System.out.println(res);
//        String[] test2 = {"7868190130M7522","5303914400F9211","9273338290F4010"};
//        String[] test2 = {"1313579440F2036","2921522980M5644"};
//        System.out.println(b1.countSeniors(test2));
//        QuickSort quickSort = new QuickSort();
//        int arr[] = {5, 8, 1, 6, 9, 14, 2};
//        quickSort.sort(arr, 0, arr.length-1);
//        String txt =  "abcde";
//        String txt2 = "aabbccddeeffgghhiiiiii";
//        String txt3 = "xyzxyzxyzxyz";
//        Keypad2 k = new Keypad2();
//        System.out.println(k.minimumPushes(txt2));
//        System.out.println(k.minimumPushes(txt3));
//        k.minimumPushes(txt);

        CombinationSum sol = new CombinationSum();
        int[] arr = {2,3,5};
//        int[] arr2 = {10,1,2,7,6,1,5}; // 8
//        var res = sol.combinationSum(arr, 8);
        int [] arr2 = {2,5,2,1,2};
        var res2 = sol.combinationSum2(arr2, 5);
        System.out.println(res2);
    }
}
