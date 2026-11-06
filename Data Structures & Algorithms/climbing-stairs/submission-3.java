class Solution {
    public int climbStairs(int n) {
        // 5 steps
        // step - step - step - step - step
        // 1 way - 2 ways - 3 ways - 5 ways (1,1,1,1 - 2,2 - 2,1,1 - 1,1,2 - 1,2,1)
        if(n <= 2) return n;
        int[] stairCount = new int[n + 1];
        stairCount[1] = 1;
        stairCount[2] = 2;
        for(int i = 3; i <= n; i++) {
            stairCount[i] = stairCount[i-1] + stairCount[i-2];
        }
        return stairCount[n];
    }
}
