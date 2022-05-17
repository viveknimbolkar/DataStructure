package array.problems;
// https://leetcode.com/problems/rotate-array/submissions/
public class RotateArray {

    void rotateArr(int[] arr, int k){
        int n = arr.length;
        int index = 0;
        int[] ans = new int[n];

        for (int i = n-k; i < n; i++) {
            ans[index] = arr[i];
            index++;
        }

        for (int i = 0; i < n-k; i++) {
            ans[index] = arr[i];
            index++;
        }

        System.arraycopy(ans,0,arr,0,n);
    }

    public static void main(String[] args) {
        RotateArray rotate = new RotateArray();
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotate.rotateArr(arr,k);

        for (int x: arr) {
            System.out.print(x+" ");
        }
    }
}
