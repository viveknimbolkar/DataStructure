package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMax {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int max = 0, min = 0;

        Collections.sort(arr);

        for(int i = 0; i < 4; i++)
            min += arr.get(i);

        for(int i = arr.size()-1; i > 4; i--)
            max += arr.get(i);

        System.out.println(min+" "+max);
    }
}
