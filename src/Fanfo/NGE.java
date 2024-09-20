package Fanfo;

class NGE {
    int findIndex(int x, int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x) return i;
        }
        return -1;
    }
    int findNext(int prev, int[] arr){
        for(int i = prev; i < arr.length; i++){
            if(arr[i] > arr[prev]) return arr[i];
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1= nums1.length; int n2= nums2.length;

        int[] indexArr = new int[n1];
        for(int i = 0; i < n1; i++){
            indexArr[i] = findIndex(nums1[i], nums2);
        }
        int[] res = new int[n1];

        for(int i =0 ; i < n1; i++){
            res[i] = findNext(indexArr[i],  nums2);

        }
        return res;
    }
}