package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://www.hackerrank.com/contests/mountblue-technologies/challenges/birthday-cake-candles
public class BirthdayCakeCandles {

    int birthdayCakeCandles(List<Integer> candles) {
        Collections.sort(candles);
        int count = 0, max = candles.get(candles.size()-1);

        // get the count of the tallest candle
        for (int i = candles.size(); i > 0 ; i--) {
            if (candles.get(i-1) == max) count++;
        }
        return count;
    }


    public static void main(String[] args) {
        BirthdayCakeCandles bir = new BirthdayCakeCandles();
        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(2);
        list.add(1);
        list.add(3);

        System.out.println(bir.birthdayCakeCandles(list));
    }
}
