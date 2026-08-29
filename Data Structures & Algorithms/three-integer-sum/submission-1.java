class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int low = 0 ; int high = nums.length-1 ; 
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for ( int i = 0 ; i <high ; i++){
            if(nums[i]>0 ){break;}
            if(i>0 && nums[i]==nums[i-1]){continue ;} // здесь мы пропусаем дублдикаты !
            int left = i+1 ; int right = high ; 
            while(left<right){
                int sum =  nums[i] + nums[left] + nums[right];
                if(sum>0){
                    right --;
                }
                else if (sum<0){
                    left++; 
                }
                else {
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    // здесь мы пропусаем дублдикаты с правой стороны!!
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;}

                }

            }
        }
       
        return result ; 
    }
}
