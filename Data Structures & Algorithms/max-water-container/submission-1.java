class Solution {
    public int maxArea(int[] heights) {
        int area = 0 ; 
        int l = 0 ; int r = heights.length-1 ; 

        for (int i = 0 ; i < heights.length  ; i++ ){
            
            area = Math.max(area, (r-l) * Math.min(heights[r],heights[l]) ); 
            System.out.println(area);

            if( Math.min(heights[r],heights[l]) == heights[l]){
                l++ ; 
            }
            else {r-- ;}

        }

        return area ; 
    }
}
