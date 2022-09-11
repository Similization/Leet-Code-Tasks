package InterviewQuestions.Task36;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task36 {
    public static void main(String[] args) {
//        System.out.println(new Solution().isValidSudoku(new char[][]{
//                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
//                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
//                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
//                {'2', '.', '.', '.', '6', '.', '.', '.', '3'},
//                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
//                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
//                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
//                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
//                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
//        }));
        System.out.println(new Solution().isValidSudoku(new char[][]{
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'}
        }));
    }
}

class Solution {
    static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

    }

    public boolean isValidSudoku(char[][] board) {
        Map<Integer, ArrayList<Pair>> map = new HashMap<>();
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (!map.containsKey(board[i][j] - '0')) {
                    map.put(board[i][j] - '0', new ArrayList<>(9));
                }
                map.get(board[i][j] - '0').add(new Pair(i, j));
                if (map.get(board[i][j] - '0').size() > 9) {
                    return false;
                }
            }
        }
        for (int i = 1; i < 10; ++i) {
            var arr = map.get(i);
            if (arr == null) {continue;}
            for (int j = 0; j < arr.size() - 1; ++j) {
                var pairFirst = arr.get(j);
                for (int k = j + 1; k < arr.size(); ++k) {
                    if (pairFirst.getX() == arr.get(k).getX() ||
                            pairFirst.getY() == arr.get(k).getY() ||
                            pairFirst.getX() / 3 == arr.get(k).getX() / 3 &&
                                    pairFirst.getY() / 3 == arr.get(k).getY() / 3) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
