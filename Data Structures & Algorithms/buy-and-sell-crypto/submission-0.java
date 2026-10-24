class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++) {
            int j = i-1;
            int maxProfitForDayI = 0;
            while(j >= 0) {
                maxProfitForDayI = Math.max(maxProfitForDayI, prices[i] - prices[j]);
                j--;
            }
            maxProfit = Math.max(maxProfit, maxProfitForDayI);
        }
        prices[0] = 0; // can't profit on day 1 lol
        return maxProfit;
    }
}
