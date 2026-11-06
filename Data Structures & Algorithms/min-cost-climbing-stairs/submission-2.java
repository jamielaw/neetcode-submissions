class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int minCost = cost[0];
        int minCost2 = cost[1];
        for(int i = 2; i < cost.length; i++) {
            int temp = minCost2;
            minCost2 = cost[i] + Math.min(minCost, minCost2);
            minCost = temp;
        }
        return Math.min(minCost2, minCost);


        // int[] minCostToGetToStep = new int[cost.length];
        // minCostToGetToStep[0] = cost[0];
        // minCostToGetToStep[1] = cost[1];
        // for(int i = 2; i < cost.length; i++) {
        //     minCostToGetToStep[i] = cost[i] + Math.min(minCostToGetToStep[i-1], minCostToGetToStep[i-2]);
        // }
        // return Math.min(minCostToGetToStep[cost.length-2], minCostToGetToStep[cost.length-1]);
    }
}
