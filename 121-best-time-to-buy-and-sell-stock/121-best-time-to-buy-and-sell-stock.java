class Solution {
    public int maxProfit(int[] prices) {
      int p=0;
      int l=0;
        int r=1;
        while(r<prices.length){
            if(prices[r]>prices[l]){
                if(prices[r]-prices[l]>p) p=prices[r]-prices[l];
            }
            else{
                l=r;
            }
            r++;
        }
    return p;
    }
}