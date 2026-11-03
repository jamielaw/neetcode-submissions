class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] pair = new int[position.length][2];
        for(int i = 0; i < position.length; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a,b) -> Integer.compare(b[0], a[0])); // sort to see which car is closer
        Stack<Double> carFleet = new Stack<>(); 
        for(int i = 0; i < position.length; i++) {
            // [7, 1, 3], [4,2, 3], [1,2,4.5], [0,1,10]
            double timeToTarget = (double) (target - pair[i][0]) / pair[i][1];
            if(carFleet.isEmpty() || carFleet.peek() < timeToTarget) {
                carFleet.push(timeToTarget);
            }
        }

        return carFleet.size();
    }
}
