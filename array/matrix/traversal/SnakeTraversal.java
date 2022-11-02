package array.matrix.traversal;

import java.util.ArrayList;

//https://practice.geeksforgeeks.org/problems/print-matrix-in-snake-pattern-1587115621/1
public class SnakeTraversal {

    ArrayList<Integer> snakePattern(int matrix[][]) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            if (i%2 == 0){
                for (int j = 0; j < matrix[i].length; j++) {
                    ans.add(matrix[i][j]);
                }
            }else{
                for (int j = matrix.length-1; j >= 0 ; j--) {
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        SnakeTraversal snake = new SnakeTraversal();
        int[][] grid = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(snake.snakePattern(grid));
    }
}
