class Solution {

    public boolean checkInclusion(String s1, String s2) {

        Map<Character, Integer> countS1= new HashMap<>(); 

        for (char c :  s1.toCharArray()){
            countS1.put(c, countS1.getOrDefault(c, 0)+1); 
        }
        // we should fix how many values are in S1, so we later can use this information we we compare it with S2
        int s1len = countS1.size(); 

        // now that we have all the info about S1 we should start comparing it to S2
        // question - does the permutation need to be connected or can the char be seperated ? 
        // probably they should be connected, wither wise the second example would have been true

        for(int i = 0 ; i<s2.length(); i++){
           Map<Character, Integer> countS2= new HashMap<>(); 
            int cur = 0 ; // we compare this to s1len-
            // we add another loop with the same index - so we can compare them the countS1 and if it does not match we move on to the next index
            for (int j = i; j<s2.length();j++){

                char c = s2.charAt(j);
                countS2.put(c, countS2.getOrDefault(c, 0)+1) ; 

                if (countS2.get(c)>countS1.getOrDefault(c, 0)){
                    break ; 
                }
                if (countS2.get(c)==countS1.get(c)){
                    cur ++ ; 
                }
                if (cur == s1len){
                    return true; 
                }

            }
            

            
        }
      
           
 return false;

        
    }
}
