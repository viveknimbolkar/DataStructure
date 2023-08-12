package dsa450.array;

public class CountPairsWithGivenSum {

    int count(int[] arr, int sum){
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length-1; j++) {
                if (arr[i]+arr[j+1]==sum) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountPairsWithGivenSum countpair = new CountPairsWithGivenSum();
        int[] arr = {1,1,1,1};
        System.out.println(countpair.count(arr,2));

    }
}
