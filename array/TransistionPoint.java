package array;

public class TransistionPoint {

    int getPoint(int[] arr){
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 1)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        TransistionPoint transistionPoint = new TransistionPoint();
        int[] arr = {0,0,0,1,1};
        System.out.println(arr[transistionPoint.getPoint(arr)]);
    }
}
