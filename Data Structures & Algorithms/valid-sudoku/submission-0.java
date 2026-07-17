
class Solution {
    public boolean isValidSudoku(char[][] board) {

 
        for (int row = 0; row < 9; row++) {
            Set<Character> set = new HashSet<>();

            for (int col = 0; col < 9; col++) {
                char c = board[row][col];

                if (c == '.') {
                    continue;
                }

                if (set.contains(c)) {
                    return false;
                }

                set.add(c);
            }
        }

     
        for (int col = 0; col < 9; col++) {
            Set<Character> set = new HashSet<>();

            for (int row = 0; row < 9; row++) {
                char c = board[row][col];

                if (c == '.') {
                    continue;
                }

                if (set.contains(c)) {
                    return false;
                }

                set.add(c);
            }
        }

        // Check each 3x3 box
        for (int startRow = 0; startRow < 9; startRow += 3) {

            for (int startCol = 0; startCol < 9; startCol += 3) {

                Set<Character> set = new HashSet<>();

                for (int row = startRow; row < startRow + 3; row++) {

                    for (int col = startCol; col < startCol + 3; col++) {

                        char c = board[row][col];

                        if (c == '.') {
                            continue;
                        }

                        if (set.contains(c)) {
                            return false;
                        }

                        set.add(c);
                    }
                }
            }
        }

        return true;
    }
}