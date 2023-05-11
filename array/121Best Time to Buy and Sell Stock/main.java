class Solution {
    public int maxProfit(int[] prices) {
        int small = prices[0];
        int res = 0;
        for(int i=1; i< prices.length; i++){
            if(small>prices[i]){
                small = prices[i];
            }
            if(prices[i] - small > res){
                res = prices[i] - small;
            }
        }
        return res;
    }
}