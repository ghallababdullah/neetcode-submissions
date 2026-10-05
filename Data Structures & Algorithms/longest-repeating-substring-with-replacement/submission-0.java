class Solution {
    public int characterReplacement(String s, int k) {
        // so here we use a sliding window where the sizw of the maximum valid window will be the answer
        HashSet<Character> set = new HashSet<>() ; 
        // the final value 
        int res = 0 ; 

        // we put the values  into the set , so we only can get the distinct values 
        for (char c : s.toCharArray()){
            set.add(c) ; 
        }

        for (char c : set){
            // we need a value that will keep track of the vounting the value at r and tha a variable for the left border of the window
            int l = 0 , count = 0 ; 
        // now we use a loop that will check the distinct values through the initila String
        for (int r = 0 ; r < s.length(); r++){

            

            // we check  if the currecnt value is equal to the target 
            if(c == s.charAt(r)){
                count ++; 
            }

            // since we use a sliding window algorithm, we need left and right border 
            // inside these border we check how many values are equal to c and how many are not 
            // we now that we k times for changing values to c .
            // so k basically should be equal of bigger that the values that are not equal to c, or then the widow is not valid
            // (r-l+1) - count - the values in the window that need to be changed to c
            while ((r-l+1) - count > k){
                 // if the first value is equal to our target then we should do count --, so we have the correct count of repeating values 
                    if (s.charAt(l) == c) {
                        count--;
                }
                l++ ; 

            }
            // this line will check all the length of the valid windows and chose the biggest one through the loop
            res = Math.max((r-l+1) , res); 
            
        }
        
    }
    return res ;}
}
