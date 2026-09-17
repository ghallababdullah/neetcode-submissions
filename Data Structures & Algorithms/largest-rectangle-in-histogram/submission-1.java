class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int n = heights.length; 

        int [] leftShortest= new int [n] ;

        int [] rightShortest= new int [n] ;


        Stack<Integer> stack = new Stack<>(); 

        for (int i = 0 ; i <n ; i++){
            leftShortest[i] = -1;
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop(); 
            }

            if(!stack.isEmpty()){
                leftShortest[i] = stack.peek(); 
            }

            stack.push(i);


        }
        stack.clear();
         for (int i = n-1 ; i >=0 ; i--){
            rightShortest[i] = n;
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop(); 
            }

            if(!stack.isEmpty()){
                rightShortest[i] = stack.peek(); 
            }

            stack.push(i);

        }
         int maxArea = 0;
         for(int i = 0 ; i<n ; i++){
            rightShortest[i]-=1;
            leftShortest[i]+=1;
            maxArea = Math.max(maxArea, heights[i] * (rightShortest[i] - leftShortest[i] + 1));
         }



        return maxArea;


    }
}
