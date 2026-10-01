class Solution {
    public int maxProfit(int[] prices) {
        int l = 0 ; 
        int maxprofit = 0 ; 
        for (int  r = 0 ; r <prices.length  ; r++ ){
            if (prices[r]>prices[l]){
                  int temp  = prices[r] - prices[l] ;
                  maxprofit = Math.max(temp,maxprofit) ;
            }
            else {
                l= r;
            }
            
        }

        return maxprofit ; 
        
    }
}
