package templates;
public class SortedArray {
    public static void main(String[] args) {
        int a[] = {1, 2 ,3 ,4 ,5};
        System.out.println(search(a, 3));
        
    }
    public static int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int pivot = -1;
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[left] <= nums[right])
            {
                pivot = left;
                break;
            }
            if(nums[mid] < nums[(mid+1)%n] && nums[mid] < nums[(mid - 1 + n)%n]){
                pivot = mid;
                break;
            }
            if(nums[mid] < nums[right]){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
       // if(pivot == 0) return binarySearch(0, n-1, target, nums);
        if(nums[0] == target) return 0;
        if(nums[0] > target) {
           return binarySearch(pivot, n-1, target, nums);
        } else {
            return binarySearch(0, pivot, target, nums);
        }
        
      
    }
    private static int binarySearch(int left, int right, int target, int[] nums){
        while(left <= right){
            int mid = left + (right -left)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) left = mid + 1;
            else right = mid -1;
        }
        return -1;
    }
}
