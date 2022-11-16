package backtracking;

import java.util.ArrayList;

//https://leetcode.com/problems/find-the-winner-of-the-circular-game/
public class FindWinnerOfCircularGame {

    int findTheWinner(int n, int k) {
        return helper(n,k)+1;
    }

    int helper(int n, int k) {
        if (n == 1) return 0;
        return (helper(n-1,k)+k)%n;
    }

    public static void main(String[] args) {
        FindWinnerOfCircularGame findwin = new FindWinnerOfCircularGame();
        int n = 5, k = 2;
        System.out.println("Winner is: "+findwin.findTheWinner(n,k));
    }
}
