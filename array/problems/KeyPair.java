package array.problems;

public class KeyPair {

    boolean hasArrayTwoCandidates(int[] arr, int n,int x){
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] + arr[j] == x){
                    System.out.println(arr[i]+arr[j]);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        KeyPair keyPair = new KeyPair();
        int[] arr = {1, 2, 4, 3, 6};
        keyPair.hasArrayTwoCandidates(arr,arr.length,10);
    }
}
