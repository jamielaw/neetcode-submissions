class Solution {
    public int hammingWeight(int n) {
        int hamming = 0;
        while(n > 0) {
            hamming += n % 2;
            n = n/2;
        }
        // 23 / 2 = 11 r 1
        // 11 / 2 = 5 r 1
        // 5 / 2 = 2 r 1
        // 2 / 2 = 0
        return hamming;
    }
}
