package array.problems;
//https://leetcode.com/problems/duplicate-zeros/
public class DuplicateZeros {

    void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                for (int j = arr.length-1; j > i ; j--) {
                    arr[j] = arr[j-1];
                }
                i++;
            }
        }
    }


    public static void main(String[] args) {
        DuplicateZeros dup = new DuplicateZeros();
        int[] arr = {1,0,2,3,0,4,5,0};

        dup.duplicateZeros(arr);

        for (int i: arr) {
            System.out.print(i+" ");
        }
    }
}
