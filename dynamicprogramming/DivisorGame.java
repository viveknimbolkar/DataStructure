package dynamicprogramming;
//https://leetcode.com/problems/divisor-game/
public class DivisorGame {
    boolean divisorGame(int n) {
        return n%2 ==0;
    }

    public static void main(String[] args) {
        DivisorGame divgame = new DivisorGame();
        int n = 3;
        System.out.println(divgame.divisorGame(n));
    }
}
