package array.problems;
//https://leetcode.com/problems/count-good-triplets/
public class GoodTriplet {

    public static void main(String[] args) {
        GoodTriplet good = new GoodTriplet();
        int[] arr = {3,0,1,1,9,7};
        int a = 7, b = 2, c = 3;
        System.out.println("Good Triplet: "+good.countGoodTriplets(arr,a,b,c));
    }

    private int countGoodTriplets(int[] arr, int a, int b, int c) {
        int goodTriplets = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if ((Math.abs(arr[i]-arr[j]) <= a) && (Math.abs(arr[j]-arr[k]) <= b) && (Math.abs(arr[i]-arr[k]) <= c)){
                        goodTriplets++;
                    }
                }
            }
        }
        return goodTriplets;
    }
}
