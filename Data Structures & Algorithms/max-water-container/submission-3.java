class Solution {
    public int maxArea(int[] heights) {
        int area = 0 ; 
        int l = 0 ; int r = heights.length-1 ; 

         while(l<r) {
            int h = Math.min(heights[r],heights[l]) ; 
            int w = (r-l) ;
            
            area = Math.max(area,  h*w ); 

            if( heights[r] >= heights[l]){
                l++ ; 
            }
            else {r-- ;}

        }

        return area ; 
    }
}
