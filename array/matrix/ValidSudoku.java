package array.matrix;

import java.util.HashSet;

// https://leetcode.com/problems/valid-sudoku/
//https://www.youtube.com/watch?v=rJ9NFK9s_mI
public class ValidSudoku {

    // funda is to check if the string is already present or not
    // if it is present in set, then it is not a valid sudoku
    // otherwise, a valid sudoku
    boolean isValidSudoku(String[][] board) {
        // store the string of format x+y+z
        // where x=row,col,box
        //       y=index of number
        //       z=actual number in the cell
        HashSet<String> seen = new HashSet<>();

        // start traversing
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != "."){
                    if (!seen.add("Row"+i+board[i][j]) || !seen.add("Col"+j+board[i][j]))
                        return false;
                    // find the no. of box using this formula
                    // where, i = row, j = col
                    // this combine together create a string
                    if (!seen.add("Box"+(i/3)*3+(j/3)+board[i][j]))  return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidSudoku sudoku = new ValidSudoku();
        String[][] board = {
                {"5","3",".",".","7",".",".",".","."},
                {"6",".",".","1","9","5",".",".","."},
                {".","9","8",".",".",".",".","6","."},
                {"8",".",".",".","6",".",".",".","3"},
                {"4",".",".","8",".","3",".",".","1"},
                {"7",".",".",".","2",".",".",".","6"},
                {".","6",".",".",".",".","2","8","."},
                {".",".",".","4","1","9",".",".","5"},
                {".",".",".",".","8",".",".","7","9"},
        };
        System.out.println("Is sudoku valid: "+sudoku.isValidSudoku(board));
    }
}
