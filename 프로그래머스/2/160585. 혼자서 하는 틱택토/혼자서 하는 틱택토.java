
class Solution {
    public int solution(String[] board) {
        int countO = 0;
        int countX = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char c = board[i].charAt(j);

                if (c == 'O') {
                    countO++;
                } else if (c == 'X') {
                    countX++;
                }
            }
        }

        if (countO < countX || countO > countX + 1) {
            return 0;
        }

        boolean oWin = existWinner(board, 'O');
        boolean xWin = existWinner(board, 'X');

        if (oWin && xWin) {
            return 0;
        }

        if (oWin && countO != countX + 1) {
            return 0;
        }

        if (xWin && countO != countX) {
            return 0;
        }

        return 1;
    }

    public boolean existWinner(String[] board, char player) {

        for (int i = 0; i < 3; i++) {
            if (board[i].charAt(0) == player &&
                board[i].charAt(1) == player &&
                board[i].charAt(2) == player) {
                return true;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (board[0].charAt(i) == player &&
                board[1].charAt(i) == player &&
                board[2].charAt(i) == player) {
                return true;
            }
        }

        if (board[0].charAt(0) == player &&
            board[1].charAt(1) == player &&
            board[2].charAt(2) == player) {
            return true;
        }

        if (board[0].charAt(2) == player &&
            board[1].charAt(1) == player &&
            board[2].charAt(0) == player) {
            return true;
        }

        return false;
    }
}
