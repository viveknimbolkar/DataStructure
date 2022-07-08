package array.problems;

import java.util.Arrays;

public class NextGreaterElement {

    void getNextGreaterElement(int[] arr){
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            int next = -1;

            for (int j = i+1; j < length; j++) {
                if (arr[i] < arr[j]) {
                    next = arr[j];
                    break;
                }
            }
            System.out.println(arr[i]+" = "+next);
        }
    }

    public static void main(String[] args) {
        NextGreaterElement nextGreaterElement = new NextGreaterElement();
        int[] elements = {4, 5, 2, 25};
        nextGreaterElement.getNextGreaterElement(elements);
    }
}
