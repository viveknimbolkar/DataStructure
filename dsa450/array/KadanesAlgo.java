package dsa450.array;

public class KadanesAlgo {

    public int kadaneAlgo(int[] arr){
        int sum = 0, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > maxi) maxi = sum;
            if (sum < maxi){
                maxi = 0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {

        KadanesAlgo kadane = new KadanesAlgo();
        int[] arr = {1,2,3,-2,5};
        System.out.println(kadane.kadaneAlgo(arr));
    }
}
