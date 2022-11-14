package problems;
//https://leetcode.com/problems/battleships-in-a-board/
public class BattleshipsInABoard {

    int countBattleships(char[][] board) {
        int ans = 0;
        int n = board.length, m = board[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] != 'X'){
                    if (i == 0 && j == 0){
                        // first cell of matrix
                        ans++;
                    }else if (i == 0){
                        // if previous board is not x
                        if (board[i][j-1] != 'X')
                            ans++;
                    }else if (j == 0){
                        if (board[i-1][j] != 'X')
                            ans++;
                    }else {
                        // if both previous and next cell is not x
                        if (board[i][j-1] != 'X' && board[i-1][j] != 'X'){
                            ans++;
                        }
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        BattleshipsInABoard battle = new BattleshipsInABoard();
        char[][] board = {
                {'X','.','.','X'},
                {'.','.','.','X'},
                {'.','.','.','X'}};

        System.out.println(battle.countBattleships(board));
    }
}
