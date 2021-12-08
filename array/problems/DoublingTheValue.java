package array.problems;

// https://practice.geeksforgeeks.org/problems/doubling-the-value4859/1
public class DoublingTheValue {

    int solve(int[] arr, int b){
        for (int i = 0; i < arr.length; i++)
            if(arr[i] == b)
                b +=b;
        return b;
    }

    public static void main(String[] args) {
        DoublingTheValue doubleTheValue = new DoublingTheValue();
        int[] arr = {1,2,3,4,8};
        int b = 2;
        System.out.println(doubleTheValue.solve(arr,b));
    }
}
