package array.problems;
//https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
public class GreatestElementOnRightSide {

    int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            int greater = findNextGreater(arr,i+1);
            ans[i] = greater;
        }
        return ans;
    }

    int findNextGreater(int[] arr, int start){
        int max = 0;
        for (int i = start; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        if (max == 0) return -1;
        return max;
    }

    public static void main(String[] args) {
        GreatestElementOnRightSide gret = new GreatestElementOnRightSide();
        int[] arr = {17,18,5,4,6,1};
        int[] arr1 = {400};
        for (int i: gret.replaceElements(arr1)) {
            System.out.print(i+" ");
        }
    }
}
