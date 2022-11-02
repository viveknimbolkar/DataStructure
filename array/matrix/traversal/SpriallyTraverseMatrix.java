package array.matrix.traversal;

import java.util.ArrayList;

// https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1
public class SpriallyTraverseMatrix {

    ArrayList<Integer> traverseSpirally(int[][] matrix, int r, int c){
        ArrayList<Integer> a = new ArrayList<>();

        int top, down, left,right;
        int direction = 0;

        top = 0;
        down = r-1;
        left = 0;
        right = c-1;


        while(left<=right && top <= down) {
            //traverse left to right
            if(direction == 0) {
                for(int i = left;i<=right;i++) {
                    a.add(matrix[top][i]);
                }
                top++;
            }else if(direction == 1) { // traverse top to down
                for(int i = top; i<=down;i++) {
                    a.add(matrix[i][right]);
                }
                right--;
            }else if(direction == 2) { // traverse form right to left
                for(int i = right ; i>=left;i--) {
                    a.add(matrix[down][i]);
                }
                down--;
            }else if(direction == 3) { // traverse from down to top
                for(int i = down; i>=top;i--) {
                    a.add(matrix[i][left]);
                }
                left++;
            }
            direction = (direction+1)%4;
        }

        return a;
    }


    public static void main(String[] args) {
        SpriallyTraverseMatrix traverseMatrix = new SpriallyTraverseMatrix();
        int[][] matrix = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9,  10, 11,12},
                {13, 14, 15,16}};

        System.out.println(traverseMatrix.traverseSpirally(matrix,4,4));


    }
}
