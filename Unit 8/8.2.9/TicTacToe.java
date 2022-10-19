public class TicTacToe {
    // copy over your constructor from the Tic Tac Toe Board activity in the
    // previous lesson!
    private int turn;
    private String[][] board = new String[3][3];

    public TicTacToe() {
        for (int i = 0; i < board.length; i++) {
            for (int k = 0; k < board[i].length; k++) {
                board[i][k] = "-";
            }
        }
    }

    // this method returns the current turn
    public int getTurn() {
        return turn;
    }

    /*
     * This method prints out the board array on to the console
     */
    public void printBoard() {
        for (int i = 0; i <= board.length; i++) {
            if (i == 0) {
                for (int k = 0; k < board[0].length; k++) {
                    if (k == 0) {
                        System.out.print("  ");
                        System.out.print(k + " ");
                    } else {
                        if (k == 2) {
                            System.out.print(k);
                        } else {
                            System.out.print(k + " ");
                        }
                    }
                }
            } else {
                for (int j = 0; j <= board[0].length; j++) {
                    if (j == 0) {
                        System.out.print(i - 1 + " ");
                    } else {
                        System.out.print(board[i - 1][j - 1] + " ");
                    }
                }
            }
            System.out.println();
        }
    }

    // This method returns true if space row, col is a valid space
    public boolean pickLocation(int row, int col) {
        boolean ret = false;
        if (row <= board.length && col <= board[row].length && board[row][col].equals("-")) {
            ret = true;
        }
        return ret;
    }

    // This method places an X or O at location row,col based on the int turn
    public void takeTurn(int row, int col) {
        if (turn % 2 == 0) {
            board[row][col] = "X";
            turn++;
        } else {
            board[row][col] = "O";
            turn++;
        }
    }

    // This method returns a boolean that returns true if a row has three X or O's
    // in a row
    public boolean checkRow() {
        boolean ret = false;
        for (int i = 0; i < board.length; i++) {
            String test = "";
            for (int k = 0; k < board[i].length; k++) {
                test += board[i][k];
            }
            if (test.equals("XXX") || test.equals("OOO")) {
                ret = true;
            }
        }
        return ret;
    }

    // This method returns a boolean that returns true if a col has three X or O's
    public boolean checkCol() {
        boolean ret = false;
        for (int i = 0; i < board.length; i++) {
            String test = "";
            for (int k = 0; k < board[i].length; k++) {
                test += board[k][i];
            }
            if (test.equals("XXX") || test.equals("OOO")) {
                ret = true;
            }
        }
        return ret;
    }

    // This method returns a boolean that returns true if either diagonal has three
    // X or O's
    public boolean checkDiag() {
        boolean ret = false;
        String test = "";
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                test += board[0][0] + board[1][1] + board[2][2];
                if (test.equals("XXX") || test.equals("OOO")) {
                    ret = true;
                }
            } else {
                test += board[0][2] + board[1][1] + board[2][0];
                if (test.equals("XXX") || test.equals("OOO")) {
                    ret = true;
                }
            }
        }
        return ret;
    }

    // This method returns a boolean that checks if someone has won the game
    public boolean checkWin() {
        if (checkRow() || checkCol() || checkDiag()) {
            return true;
        } else {
            return false;
        }
    }

}