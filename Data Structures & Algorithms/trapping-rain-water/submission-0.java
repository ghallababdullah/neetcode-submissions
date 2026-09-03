class Solution {
    public int trap(int[] height) {
        int total = 0 ; 
        int l = 0 ; int r = height.length -1; 
        int leftMax = height[l], rightMax = height[r];
// так как у нас опятьвысоты стольбецев карты высот определяют какие количество воды , мы будем использовать twoPointers. Подача воды в любом положении зависит от более короткой стенки между левой и правой сторонами.
        while(l<r){
              if (leftMax < rightMax) {
                l++;
                leftMax = Math.max(leftMax, height[l]);
                total += leftMax - height[l];
            } else {
                r--;
                rightMax = Math.max(rightMax, height[r]);
                total += rightMax - height[r];
            }

            }




return total ; 
        
    }
}
