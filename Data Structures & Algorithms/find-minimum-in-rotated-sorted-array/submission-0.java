class Solution {
    public int findMin(int[] nums) {

        int n = nums.length; 
        // ascending order
        // after the rotating we are going to have a problem, hence the array is not sorted any more to find the middle and perform the algorothim. 

        int r =n - 1 ;
        int l = 0 ; 
        int res = nums[0];

        while(l<=r){
             if (nums[l] < nums[r]) {
                res = Math.min(res, nums[l]);
                break;
            }
            int mid = l + (r-l)/2 ; 
            res = Math.min(res, nums[mid]);//

            if(nums[mid]>=nums[l]){
                l = mid +1 ; 
            }
            else{r = mid-1; }




        }


        return res ; 
    }
}
