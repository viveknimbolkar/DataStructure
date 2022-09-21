package array.problems;

import java.util.ArrayList;
import java.util.Collections;

//https://leetcode.com/problems/a-number-after-a-double-reversal/
public class DoubleReversal {

    boolean isSameAfterReversals(int num) {
        ArrayList<Integer> digits = getDigits(num);
        Collections.reverse(digits);

        StringBuilder sb = new StringBuilder();

        for (int i: digits)
            sb.append(i);
        int temp = Integer.valueOf(sb.toString());
        if( temp == num)
            return true;
        return false;
    }



    ArrayList<Integer> getDigits(int n){
        ArrayList<Integer> list = new ArrayList<>();
        while (n > 0){
            int remainder = n % 10;
            if (remainder != 0)
                list.add(remainder);
            n /= 10;
        }
        return list;
    }

    public static void main(String[] args) {
        DoubleReversal dob = new DoubleReversal();
        int n = 1800;
        System.out.println("Is same: "+dob.isSameAfterReversals(n));
    }
}
