package array.matrix;
//https://practice.geeksforgeeks.org/problems/left-rotate-matrix-k-times2351/1
public class LeftRotateMatrixKTimes {

    int[][] rotateMatrix(int N, int M, int K, int Mat[][]) {
        int[][] ans = new int[N][M];
        for (int i = 0; i < N; i++) {
            int[] rotatedUptoK = rotate(Mat[i], K);
            for (int j = 0; j < rotatedUptoK.length; j++) {
                ans[i][j] = rotatedUptoK[j];
            }
        }
        return ans;
    }

    // rotate array upto k times
    int[] rotate(int[] arr, int k){
        for (int i = 0; i < k; i++) {
            leftRotateByOne(arr);
        }
        return arr;
    }

    // rotate array upto once
    void leftRotateByOne(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length-1; i++)
            arr[i] = arr[i+1];
        arr[arr.length-1] = temp;
    }

    public static void main(String[] args) {
        LeftRotateMatrixKTimes left = new LeftRotateMatrixKTimes();
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] rotated = left.rotateMatrix(arr.length, arr[0].length,1,arr );

        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated[i].length; j++) {
                System.out.print(rotated[i][j]);
            }
            System.out.println();
        }
    }
}
