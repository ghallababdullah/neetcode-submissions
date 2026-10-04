class Solution {
    public int lengthOfLongestSubstring(String s) {
         HashSet<Character> chars =new HashSet<>();
        int maxlen = 0 ; 
        // i = left 
        // j = right
        int i = 0 ; 
        for (int j = 0; j < s.length() ; j++){

            while(chars.contains(s.charAt(j))){
                chars.remove(s.charAt(i)); 
                i++;
            }

            chars.add(s.charAt(j)); 
            maxlen= Math.max(maxlen, j-i +1); 
            


          

        }

        
        return maxlen ;
    }
}
