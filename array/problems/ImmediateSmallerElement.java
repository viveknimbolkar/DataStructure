package array.problems;
// https://practice.geeksforgeeks.org/problems/immediate-smaller-element1142/1/?
public class ImmediateSmallerElement {

    void immediateSmaller(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            if (arr[i+1] < arr[i]){
                arr[i] = arr[i+1];
            }else{
                arr[i] = -1;
            }
            arr[n-1] = -1;

        }
    }

    public static void main(String[] args) {
        ImmediateSmallerElement immediate = new ImmediateSmallerElement();
        int[] arr = {4, 2, 1, 5, 3};
        immediate.immediateSmaller(arr,arr.length);


        for (int a:arr) {
            System.out.print(a);
        }
    }
}
