class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int lowestSeen = prices[0];
        for(int i = 0; i < prices.length; i++) {
            lowestSeen = Math.min(lowestSeen, prices[i]);
            maxP = Math.max(maxP, prices[i] - lowestSeen);
        }
        return maxP;
    }
}
