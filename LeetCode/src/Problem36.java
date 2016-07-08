import java.util.HashSet;

/**
 * Created by Leart Doko on 7/8/2016.
 */
public class Problem36 {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> row = new HashSet<Character>();
            HashSet<Character> column = new HashSet<Character>();
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    if (row.contains(board[i][j])) {
                        return false;
                    } else {
                        row.add(board[i][j]);
                    }
                }
                if (board[j][i] != '.') {
                    if (column.contains(board[j][i])) {
                        return false;
                    } else {
                        column.add(board[j][i]);
                    }
                }
            }
        }
        for (int section = 0; section < 9; section++) {
            HashSet<Character> box = new HashSet<Character>();
            for (int i = section / 3 * 3; i < section / 3 * 3 + 3; i++) {
                for (int j = section % 3 * 3; j < section % 3 * 3 + 3; j++) {
                    if (board[i][j] != '.') {
                        if (box.contains(board[i][j])) {
                            return false;
                        } else {
                            box.add(board[i][j]);
                        }
                    }
                }
            }
        }
        return true;
    }
}
