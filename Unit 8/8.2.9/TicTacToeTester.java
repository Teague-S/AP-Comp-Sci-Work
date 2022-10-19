import java.util.Scanner;

public class TicTacToeTester {
    public static void main(String[] args) {
        TicTacToe board = new TicTacToe();
        Scanner scanner = new Scanner(System.in);
        boolean win = false;
        while (win == false) {
            System.out.println("Input row");
            int firstMove = scanner.nextInt();
            System.out.println("Input column");
            int secondMove = scanner.nextInt();
            if (firstMove >= 3 || secondMove >= 3 || board.pickLocation(firstMove, secondMove) == false) {
                boolean x = false;
                while (x == false) {
                    System.out.println("Invalid input! Please input a valid move");
                    System.out.println("Input row");
                    int fM = scanner.nextInt();
                    System.out.println("Input column");
                    int sM = scanner.nextInt();
                    if (fM < 3 && sM < 3 && board.pickLocation(fM, sM)) {
                        board.takeTurn(fM, sM);
                        x = true;
                    }
                }
            } else {
                board.takeTurn(firstMove, secondMove);
            }
            board.printBoard();
            if (board.checkWin()) {
                if (board.getTurn() % 2 == 0) {
                    System.out.println("O wins!");
                } else {
                    System.out.println("X wins!");
                }
                win = true;
            }
            if (board.getTurn() == 9 && board.checkWin() == false) {
                System.out.println("Tie");
                win = true;
            }
        }
    }
}