class Solution {
    public int search(int[] nums, int target) {

        int n = nums.length; 
        int  l = 0 ; 
        int r = n-1 ; 
        int res = -1 ; 

        while (l<r){
            int mid = (l + r) / 2;; 

            if (nums[mid] > nums[r]){
                // this means the pivot is on the right side
                l = mid + 1;
        }
            else{
                // this means the pivot is on the left side
                // we do r = mid and not mid -1 so we dont skip the mid 
                r = mid ; 
            }
    }

    int pivot = l ; 
    l = 0 ; 
    r = nums.length - 1;

    if(target >= nums[pivot] && target <= nums[r]){
         l = pivot;
    }
    else {
         r = pivot - 1;
    }

     while (l <= r) {
            int m = (l + r) / 2;
            if (nums[m] == target) {
                return m;
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
    
     return -1;
    }
    
}
