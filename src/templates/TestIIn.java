package templates;
public class TestIIn {
    public static void main(String args[]) {
        int nums[] = {4,5,6};
         int n = nums.length;
        int res = 0;
        for(int i = 0; i < n-1; i++){
            int prev2 = nums[i];
            int prev = nums[i+1];
            res = 2;
            
            for(int j = i+2; j < n; j++){
                
                if(nums[j] == prev  || nums[j] != prev2){
                    break;
                }            
                int len = (j - i+1);
                res = res > len ? res : len;
               
                prev2 = prev;
                prev = nums[j];
            }
        }
        System.out.println(res);
    }
}
