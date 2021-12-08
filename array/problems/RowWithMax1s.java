package array.problems;

// https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1/
public class RowWithMax1s {

    int findThatRow(int[][] arr){
        int count = 0, index=0, max = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            for(int data:arr[i]){
                count += data;
            }
            if(count> max){
                max = count;
                index = i;
            }
            count = 0;
        }
        if(max == 0) return -1;
        return index;
    }

    public static void main(String[] args) {
        RowWithMax1s rowWithMax1s = new RowWithMax1s();
        int[][] arr = {
                {0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}
        };
        System.out.println(rowWithMax1s.findThatRow(arr));
    }
}
