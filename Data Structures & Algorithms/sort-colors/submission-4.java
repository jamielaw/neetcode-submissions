class Solution {
    public void sortColors(int[] nums) {
        int zero = 0, one = 0;
        for(int two = 0; two < nums.length; two++) {
            int temp = nums[two];
            nums[two] = 2;
            if(temp < 2) {
                nums[one++] = 1;
            }
            if(temp < 1) {
                nums[zero++] = 0;
            }
        }
    }
        // int[] counts = new int[3];
        // for(int num : nums) {
        //     counts[num]++;
        // }
        // int count = 0;
        // for(int i = 0; i < 3; i++) {
        //     for(int j = 0; j < counts[i]; j++) {
        //         nums[count] = i;
        //         count++;
        //     }
        // }
}