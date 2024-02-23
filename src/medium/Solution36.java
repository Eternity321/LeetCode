package medium;

import java.util.HashMap;
import java.util.Scanner;

public class Solution36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int n = 9;
//        int m = 9;
//        char[][] board = new char[n][m];
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < m; j++) {
//                board[i][j] = scanner.next().charAt(0);
//            }
//        }
        char[][] board = {
                {'5', '3', '.', '.', '5', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        int line[][] =   new int[9][9];
        int col[][] =    new int[9][9];
        int square[][] = new int[9][9];
        for(int i = 0; i < 9 ; i++) {
            for(int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int pos = board[i][j] - '0' - 1;
                    int pos_square = (i / 3) + (j / 3) * 3;
                    if (++line[i][pos] > 1 || ++col[pos][j] > 1 || ++square[pos_square][pos] > 1) return false;
                }
            }
        }
        return true;
    }
}