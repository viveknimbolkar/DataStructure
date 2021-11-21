package array;

public class FindNumberOfOccurance {

    int find(int[] arr, int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == x)
                count++;

        return count;
    }

    public static void main(String[] args) {
        FindNumberOfOccurance findNumberOfOccurance = new FindNumberOfOccurance();
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int x = 2;
        System.out.println(findNumberOfOccurance.find(arr,x));
    }
}
