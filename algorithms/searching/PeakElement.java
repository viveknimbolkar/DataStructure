package algorithms.searching;
// https://practice.geeksforgeeks.org/problems/peak-element/1/

public class PeakElement {

    int getPeakElement(int[] arr){
        int peak = 0;
        for(int i = 0; i< arr.length-1; i++){
            if(arr[i] < arr[i+1]){
                peak = i+1;
            }
        }
        return peak;
    }

    public static void main(String[] args) {
        PeakElement peak = new PeakElement();
        int[] arr = {1,2,3};
        System.out.println(peak.getPeakElement(arr));
    }
}
