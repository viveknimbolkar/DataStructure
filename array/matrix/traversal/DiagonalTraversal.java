package array.matrix.traversal;

public class DiagonalTraversal {

    // traverse diagonal element
    void diagonalTraverse(int[][] grid){
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid.length; i++, j++)
                System.out.println(grid[j][i]);
    }

    public static void main(String[] args) {
        DiagonalTraversal dig = new DiagonalTraversal();

        int[][] grid = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        dig.diagonalTraverse(grid);
    }
}
