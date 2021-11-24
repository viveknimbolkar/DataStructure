package array;

// https://practice.geeksforgeeks.org/problems/average4856/1/
public class AverageInArray {

    float[] streamAvg(int[] arr, int n) {
        float[] tempArr = new float[n];

        float currentNum = 0;
        for(int i = 0; i<n; i++){
            currentNum += arr[i];
            tempArr[i] =(int) currentNum/(i+1);
        }
        return tempArr;
    }

    public static void main(String[] args) {
        AverageInArray averageInArray = new AverageInArray();
        int[] arr = {10, 20, 30, 40, 50};
        float[] newArr = averageInArray.streamAvg(arr, arr.length);
        for (float d: newArr)
            System.out.print(d+" ");

    }
}
