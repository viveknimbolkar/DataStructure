package array.matrix.traversal;
// https://leetcode.com/problems/search-a-2d-matrix/
public class SearchElement {

    boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SearchElement search = new SearchElement();
        int[][] mat = {
                {1,4,6,8,9},
                {21,23,25,27},
                {31,32,36,37},
                {68,79,86,89}
        };

        System.out.println("Found: "+search.searchMatrix(mat,27));
    }
}
