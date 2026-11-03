class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while(!seen.contains(n)) {
            seen.add(n);
            int next = 0;
            while(n / 10 > 0) { // more than one digit
                next += (n % 10) * (n % 10);
                n /= 10;
            }
            next += n * n;
            if(next == 1) return true;
            n = next;
        }
        return false;
    }
}
