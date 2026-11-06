class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] minCostToGetToStep = new int[cost.length];
        minCostToGetToStep[0] = cost[0];
        minCostToGetToStep[1] = cost[1];
        for(int i = 2; i < cost.length; i++) {
            minCostToGetToStep[i] = cost[i] + Math.min(minCostToGetToStep[i-1], minCostToGetToStep[i-2]);
        }
        return Math.min(minCostToGetToStep[cost.length-2], minCostToGetToStep[cost.length-1]);
    }
}
