package array;

public class MakeArrayEven {

    int addMinNumber(int[] arr){
        int sum = 0;
        for (int element:arr)
            sum+=element;

        if (sum%2 == 0) return 2;
        else return 1;
    }

    public static void main(String[] args) {
        MakeArrayEven makeArrayEven = new MakeArrayEven();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8,9,10};
        System.out.println(makeArrayEven.addMinNumber(arr));
    }
}
