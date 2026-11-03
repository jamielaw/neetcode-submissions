class Solution {
    public int trap(int[] height) {
        int[] prefix = new int[height.length];
        int[] suffix = new int[height.length];
        prefix[0] = height[0];
        for(int i = 1; i < height.length; i++) {
            prefix[i] = Math.max(prefix[i-1], height[i]);
            //0,2,2,3,3,3,3,3,3,3
        }
        suffix[height.length-1] = height[height.length-1];
        for(int j = height.length-2; j >= 0; j--) {
            suffix[j] = Math.max(suffix[j+1], height[j]);
            //3,3,3,3,3,3,3,3,2,1
        }
        int totalArea = 0;
        for(int x = 0; x < height.length; x++) {
            // System.out.println(Math.min(prefix[x], suffix[x]) - height[x]);
            totalArea += Math.min(prefix[x], suffix[x]) - height[x];
        }
        return totalArea;
    }
}
