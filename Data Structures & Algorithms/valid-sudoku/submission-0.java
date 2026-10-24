class Solution {
    public boolean isValidSudoku(char[][] board) {
        /* brute force: for each column/row/box check to see if there are dupes
        O(3n^2) for time complexity
         - O(n) for space complexity (we just use one array to check, but that would increase time complexity by checking each element in the array and then make it n^3)
         - O(n^2) for space complexity by using a HashMap for each check to see if its already there at O(1) lookups and inserts
        */
        for(int i = 0; i < 9; i++) { // check columns
            Set<Character> intSet = new HashSet<>();
            for(int j = 0; j < 9; j++) { // each row inside column
                if(board[i][j] != '.') {
                    if(intSet.contains(board[i][j])) return false;
                    intSet.add(board[i][j]);
                }
            }
        }

        for(int i = 0; i < 9; i++) { // check rows
            Set<Character> intSet = new HashSet<>();
            for(int j = 0; j < 9; j++) { // each column inside row
                if(board[j][i] != '.') {
                    if(intSet.contains(board[j][i])) return false;
                    intSet.add(board[j][i]);
                }
            }
        }

        for(int i = 0; i < 9; i +=3) {
            for(int j = 0; j < 9; j += 3) { //for each box
                Set<Character> intSet = new HashSet<>();
                for(int x = i; x < i+3; x++) {
                    for(int y = j; y < j+3; y++) {
                        if(board[x][y] != '.') {
                            if(intSet.contains(board[x][y])) return false;
                            intSet.add(board[x][y]);
                        }
                    }
                }
            }
        }
        return true;
    }
}
