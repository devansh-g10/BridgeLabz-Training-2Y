import java.util.Scanner;

public class tictactoe {
    static char[][] board = new char[3][3];

    
    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    
    public static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

   
    public static boolean isValidMove(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3) {
            return board[row][col] == ' ';
        }
        return false;
    }

   
    public static void makeMove(int row, int col, char player) {
        board[row][col] = player;
    }

  
    public static boolean checkWinner(char player) {
       
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }
        return false;
    }

   
    public static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        initializeBoard();
        char currentPlayer = 'X';
        boolean gameEnded = false;

        System.out.println("Welcome to Tic Tac Toe!");
        printBoard();

        while (!gameEnded) {
            int row, col;

            
            while (true) {
                System.out.println("Player " + currentPlayer + ", enter your move (row and column: 0, 1, or 2): ");
                row = sc.nextInt();
                col = sc.nextInt();

                if (isValidMove(row, col)) {
                    break;
                } else {
                    System.out.println("Invalid move! Try again.");
                }
            }

            
            makeMove(row, col, currentPlayer);
            printBoard();

            
            if (checkWinner(currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins!");
                gameEnded = true;
            } else if (isBoardFull()) {
                System.out.println("The game is a draw!");
                gameEnded = true;
            } else {
                
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
        sc.close();
    }
}