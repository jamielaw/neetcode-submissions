class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 1) return nums;
        int[] result = new int[k];
        List<Integer>[] frequencyList = new ArrayList[nums.length+1];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length+1; i++) {
            frequencyList[i] = new ArrayList<>();
        }
        for(int num : nums) {
            map.merge(num, 1, Integer::sum);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            frequencyList[entry.getValue()].add(entry.getKey());
        }
        int currentCount = 0;
        for(int i = nums.length; i > 0; i--) {
            for(Integer x : frequencyList[i]) {
                if(currentCount==k) break;
                result[currentCount] = x;
                currentCount++;
            }
        }
        return result;
    }
}
