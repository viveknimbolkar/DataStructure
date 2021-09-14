package dcscracker;

public class KadaneAlgo {

    int findMaxSumArray(int[] arr){
        int size = arr.length;
        int max = 0;
        int totalMax = Integer.MIN_VALUE; // all negative values

        for (int i = 0; i < size; i++) {
            max = max + arr[i];
            if (max < totalMax)
                max = totalMax;
            if(totalMax < 0)
                totalMax = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        KadaneAlgo kalgo = new KadaneAlgo();
        int[] data = {-4,-6,4,-3,6,-5,3,2};
        int sum = kalgo.findMaxSumArray(data);
        System.out.println(sum);
    }
}
