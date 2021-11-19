package array;
// https://practice.geeksforgeeks.org/problems/multiply-left-and-right-array-sum1555/1/
public class MultiplyLeftAndRight {

    int multiply(int[] arr){
        int mid = arr.length/2;
        int sumOfLeft = 0, sumOfRight=0;

        for (int i = 0; i < mid; i++)
            sumOfLeft+=arr[i];


        for (int i = mid; i < arr.length; i++)
            sumOfRight+=arr[i];

        return sumOfLeft*sumOfRight;
    }

    public static void main(String[] args) {
        MultiplyLeftAndRight multiplyLeftAndRight = new MultiplyLeftAndRight();
        int[] arr = {1, 2, 3, 4};
        System.out.println(multiplyLeftAndRight.multiply(arr));
    }
}
