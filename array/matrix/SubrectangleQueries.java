package array.matrix;
//https://leetcode.com/problems/subrectangle-queries/
public class SubrectangleQueries {
    int[][] rectangle;
    SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i < rectangle.length; i++) {

        }
    }

    public int getValue(int row, int col) {
        return rectangle[row][col];
    }

    public static void main(String[] args) {
        int[][] rectangle = {
                {1,2,1},
                {4,3,4},
                {3,2,1},
                {1,1,1}
        };
        SubrectangleQueries sub = new SubrectangleQueries(rectangle);

        System.out.println(sub.getValue(0,2));
//        sub.updateSubrectangle(0,0,3,2,5);

        System.out.println();
        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[i].length; j++) {
                System.out.print(rectangle[i][j]+" ");
            }
            System.out.println();
        }
    }

}
