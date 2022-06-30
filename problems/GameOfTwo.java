package problems;

import java.util.ArrayList;

public class GameOfTwo {

     int closestPower(int n) {
         int res = 0;
         for(int i = n; i >= 1; i--) {
             // If i is a power of 2
             if ((i & (i-1)) == 0) {
                 res = i;
                 break;
             }
         }
         return res;
    }

    public static void main(String[] args) {
        GameOfTwo game = new GameOfTwo();
        int n = 7;
        System.out.println("Power: "+game.closestPower(n));

    }
}
