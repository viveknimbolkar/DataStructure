package array.problems;
//TODO: solve runtime error
import java.util.ArrayList;

public class ValueEqualsToIndex {

    ArrayList<Integer> findThatValue(int[] arr){
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++)
            if (arr[i] == i+1)
                arrayList.add(arr[i]);

        return arrayList;
    }

    public static void main(String[] args) {
        ValueEqualsToIndex valueEqualsToIndex = new ValueEqualsToIndex();
        int[] arr = {10, 2, 45, 12, 7};

        System.out.println(valueEqualsToIndex.findThatValue(arr));


    }
}
