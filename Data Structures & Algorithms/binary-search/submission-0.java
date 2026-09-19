class Solution {
    public int search(int[] nums, int target) {
        int top = nums.length -1 ; 
        int bot = 0 ;
      
        int res = -1;

        while (top>=bot){
      
            int mid = bot + (top - bot) / 2; 
            if(target> nums[mid]){
                bot = mid +1 ; 
             
            }
            else if (target< nums[mid]){
                top = mid-1 ; 
           
            }
            else {
                res = mid ; 
                break ; 

            }
        
        }
        return res; 
    }
}
