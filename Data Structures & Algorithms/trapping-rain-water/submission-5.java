class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length-1;
        int leftMax = height[0];
        int rightMax = height[height.length-1];
        int totalArea = 0;
        while(l < r) {
            if(height[l] > height[r]) {
                totalArea += Math.min(leftMax, rightMax) - height[r];
                r--;
                rightMax = Math.max(rightMax, height[r]);
            } else {
                totalArea += Math.min(leftMax, rightMax) - height[l];
                l++;
                leftMax = Math.max(leftMax, height[l]);
            }
        }
        return totalArea;
    }
}
