class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // ЗДЕСЬ У нас есть намек что первый элемент из каждой строки больше чем придыдуший 
        // то есть сами строки отсортированы 
        int m = matrix.length ; 
        int n = matrix[0].length ; 
        int bot = 0; 
        int top = m *n -1 ; 
  
        while(top>= bot){
            int mid = bot + (top-bot)/2 ; 

            // вернем все обраьно в 2d
            int row = mid / n ; 
            int col = mid % n ;
            int middle_Val = matrix[row][col];


            if (middle_Val< target){
                bot = mid +1 ;
            }
            else if (middle_Val> target){
                top = mid -1 ;
            }
            else {
               
                return true  ; 

            }
        }

      
        return false ; 
    }
}
