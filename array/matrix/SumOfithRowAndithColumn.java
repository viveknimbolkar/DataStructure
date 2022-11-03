package array.matrix;
//https://practice.geeksforgeeks.org/problems/sums-of-i-th-row-and-i-th-column3054/1
public class SumOfithRowAndithColumn {
    // n-row
    // m-col
    int sumOfRowCol(int N, int M, int A[][]) {
        int rowsum = 0, colsum = 0;
        // get row sum
        for (int i = 0; i < M; i++) {
            rowsum += A[N-1][i];
        }

        // get col sum
        for (int i = 0; i < N; i++) {
            colsum += A[i][M-1];
        }

        System.out.println("rowsum: "+rowsum);
        System.out.println("colsum: "+colsum);
        if (rowsum == colsum) return 1;
        return 0;
    }

    public static void main(String[] args) {
        SumOfithRowAndithColumn sum = new SumOfithRowAndithColumn();
        int[][] arr = {
                {1,2},
                {2,1}
        };
        System.out.println("is equal row and col: "+sum.sumOfRowCol(arr.length,arr[0].length,arr));
    }
}
