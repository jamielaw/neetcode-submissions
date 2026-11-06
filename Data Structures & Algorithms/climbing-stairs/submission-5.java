class Solution {
    public int climbStairs(int n) {
        // 5 steps
        // step - step - step - step - step
        // 1 way - 2 ways - 3 ways - 5 ways (1,1,1,1 - 2,2 - 2,1,1 - 1,1,2 - 1,2,1)
        if(n <= 2) return n;
        int[] prev = new int[2];
        prev[0] = 1;
        prev[1] = 2;
        for(int i = 3; i <= n; i++) {
            int temp = prev[1];
            prev[1] = prev[0] + prev[1];
            prev[0] = temp;
        }
        return prev[1];
    }
}
