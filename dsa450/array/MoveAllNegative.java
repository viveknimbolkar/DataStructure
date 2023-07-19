package dsa450.array;

public class MoveAllNegative {

    public void moveAllNegative(int[] arr){
        int j = 0, temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0){
                if (i != j){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        MoveAllNegative mv = new MoveAllNegative();
        int[] arr =  {-1,3,7,-1,-2,-6,3,-6};
        mv.moveAllNegative(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
