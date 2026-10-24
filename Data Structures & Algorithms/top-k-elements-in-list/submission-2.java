class Solution {
    public int[] topKFrequent(int[] nums, int k ) {
        Map<Integer, Integer> numMap = new HashMap<>();
        List<Integer>[] frequencyList = new ArrayList[nums.length];
        for(int i = 0; i < nums.length; i++) {
            frequencyList[i] = new ArrayList<>();
        }
        for(int num : nums) {
            numMap.merge(num, 1, Integer::sum);
        }
        for(Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
            frequencyList[entry.getValue()-1].add(entry.getKey());
        }
        int counter = 0;
        int[] finalList = new int[k];
        for(int i = nums.length-1; i >= 0 && counter < k; i--) {
            if(!frequencyList[i].isEmpty()) {
                for(Integer x : frequencyList[i]) {
                    finalList[counter] = x;
                    counter++;
                }
            }
        }
        return finalList;
        
    }
































    public int[] topKFrequentOld(int[] nums, int k) {
        Map<Integer, Integer> numMap = new HashMap<>();
        List<Integer>[] frequencyIndex = new List[nums.length + 1];

        for(int i = 0; i <= nums.length; i++) {
            frequencyIndex[i] = new ArrayList<>();
        }
        for(int num: nums) {
            numMap.merge(num, 1, Integer::sum);
        }
        for(Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
            frequencyIndex[entry.getValue()].add(entry.getKey());
        }

        int[] finalList = new int[k];
        int counter = 0;
        for(int i = nums.length; i > 0 && counter < k; i--) {
            if(!frequencyIndex[i].isEmpty()) {
                for(int num : frequencyIndex[i]) {
                    finalList[counter] = num;
                    counter++;
                }
            }
        }
        return finalList;
    }
}
