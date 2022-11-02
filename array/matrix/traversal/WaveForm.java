package array.matrix.traversal;

public class WaveForm {

    public static void main(String[] args) {
        WaveForm wf = new WaveForm();

        int[][] grid = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        wf.traverseWaveForm(grid);
    }

     void traverseWaveForm(int[][] grid) {
         for (int i = 0; i < grid.length; i++) {
             // for even cols traverse from top to bottom
             if (i%2 == 0)
                 for (int j = 0; j < grid.length; j++) {
                     System.out.print(grid[j][i]+" ");

             }else{
                 //for odd cols traverse from bottom to top
                 for (int j = grid.length-1; j >= 0 ; j--)
                     System.out.print(grid[j][i]+" ");

             }
             System.out.println();
         }
    }
}
