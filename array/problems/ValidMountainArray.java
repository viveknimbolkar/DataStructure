package array.problems;
//https://leetcode.com/problems/valid-mountain-array/
public class ValidMountainArray {

    boolean validMountainArray(int[] arr) {
        int top = -1, i;
        for (i = 0; i < arr.length-1; i++) {
            if (arr[i] >= arr[i+1]){
                top = i;
                break;
            }
        }
        System.out.println(top);

        for (int j = i; j < arr.length-1; j++) {
            if (arr[j] <= arr[j+1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidMountainArray valid = new ValidMountainArray();
        int[] arr = {0,3,2,1};
        int[] arr1 = {3,5,5};
        int[] arr2 = {2,1};
        System.out.println("is mountain: "+valid.validMountainArray(arr2));
    }
}
