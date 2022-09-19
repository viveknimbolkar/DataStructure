package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://www.hackerrank.com/contests/mountblue-technologies/challenges/plus-minus
public class PlusMinus {

    void plusMinus(List<Integer> arr) {
        float positive = 0, negative = 0, zero = 0;

        for (int i = 0; i < arr.size(); i++) {
            int ele = arr.get(i);
            if (ele > 0) positive++;
            else if (ele <0) negative++;
            else zero++;
        }
        int len = arr.size();

        System.out.printf("%1.6f\n",positive/len);
        System.out.printf("%1.6f\n",negative/len);
        System.out.printf("%1.6f\n",zero/len);

    }

    public static void main(String[] args) {
        PlusMinus pm = new PlusMinus();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(-1);
        list.add(-1);
        list.add(0);

       pm.plusMinus(list);
    }
}
