package algorithms.searching;
// https://practice.geeksforgeeks.org/problems/find-triplets-with-zero-sum/1/?
public class TripletSum {

    boolean findTriplets(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-2; i++)
            for (int j = i+1; j < n-1; j++)
                for (int k = 0; k < n; k++)
                    if (arr[i] + arr[i+1] + arr[i+2] == 0) return true;

        return false;
    }

    public static void main(String[] args) {
        TripletSum triplet = new TripletSum();
        int[] arr = {0,-1,2,-3,1};
        System.out.println("Triplet Found: "+triplet.findTriplets(arr));
    }
}
