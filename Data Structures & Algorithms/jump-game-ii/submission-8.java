class Solution {
    public int jump(int[] nums) {
        int i = 0;
        int numJumps = 0;
        while(i < nums.length-1) {
            int jumpDistance = nums[i];
            int bestJump = 0;
            if(i + jumpDistance >= nums.length - 1) {
                numJumps++;
                break;
            }
            for(int j = i + 1; j <= i + jumpDistance; j++) {
                bestJump = Math.max(bestJump, j+nums[j]);
            }
            numJumps++;
            i += (bestJump - i);
            numJumps++;
        }
        return numJumps;
    }
}
