class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board.length; ++j) {
                if (board[i][j] != '.') {
                    if (!seen.add(board[i][j] + "at row" + i) ||
                    !seen.add(board[i][j] + "at col" + j) ||
                    !seen.add(board[i][j] + "at" + i / 3 + "/" + j/3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
