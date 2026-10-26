class Solution {
    public int trap(int[] height) {
        // 2 ptrs
        int left = 0;
        int right = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int totalArea = 0;
        while(left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if(leftMax < rightMax) {
                totalArea += leftMax - height[left];
                left++;
            } else {
                totalArea += rightMax - height[right];
                right--;
            }
        }
        return totalArea;
    }

    public int trapArrays(int[] height) {
        // arrays
        int[] prefixes = new int[height.length];
        int[] suffixes = new int[height.length];
        
        // 0,2,2,3,3,3,3,3,3,3
        prefixes[0] = height[0];
        for(int i = 1; i < height.length; i++) {
            prefixes[i] = Math.max(prefixes[i-1], height[i]);
        }

        // 3,3,3,3,3,3,3,3,2,1
        suffixes[height.length-1] = height[height.length-1];
        for(int j = height.length-2; j >= 0; j--) {
            suffixes[j] = Math.max(suffixes[j+1], height[j]);
        }

        int totalArea = 0;
        for(int x = 0; x < height.length; x++) {
            int peak = Math.min(prefixes[x], suffixes[x]);
            totalArea += peak-height[x];
        }
        return totalArea;
    }
}
