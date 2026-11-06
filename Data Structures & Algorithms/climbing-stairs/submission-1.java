class Solution {
    public int climbStairs(int n) {
        // 5 steps
        // step - step - step - step - step
        // 1 way - 2 ways - 3 ways - 5 ways (1,1,1,1 - 2,2 - 2,1,1 - 1,1,2 - 1,2,1)
        Map<Integer, Integer> stairMap = new HashMap<>();
        stairMap.put(1, 1);
        stairMap.put(2, 2);
        for(int i = 3; i <= n; i++) {
            stairMap.put(i, stairMap.get(i-1) + stairMap.get(i-2));
        }
        return stairMap.get(n);
    }
}
