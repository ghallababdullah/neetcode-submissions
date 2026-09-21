class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        // pile[i] - number of bananas in one pile 

        // h - number of hours to eat all bananas

       // k - rate bananas per out p/hour ? speed 

       //piles = Array.sort(piles) ; 
        int l = 1 ; 
        int r = Arrays.stream(piles).max().getAsInt() ; 
        int res = r ; 

        while (l <= r){
            int k =  (l+r)/2 ; // we start using the middle spead for the first try 

            long totalTime = 0 ; // here we count the time that will be needed to eat all piles with this spead

            for (int pile :piles){
                totalTime += Math.ceil((double) pile/k) ; // here we keep adding the spead needed for each pile 
            }

            if(totalTime <=h){ // if the total time is less than the needed time , this is good but we try less values maybe we can find a better rate 
                res = k ; 
                r= k-1 ; 
            }
            else {
                l = k+1 ; // or we try the right half were the rate will be higher 
            }





        }

       



 return res;
        
    }}

