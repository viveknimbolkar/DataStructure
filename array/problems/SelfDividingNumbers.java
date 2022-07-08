package array.problems;

import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/self-dividing-numbers/
public class SelfDividingNumbers {

    List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();

        // find out all the numbers which are divisible by itself
        for (int i = left; i <= right; i++)
            // find out the no. which is divisible by its own numbers
           if (isValidNum(i))
               ans.add(i);

        return ans;
    }

    boolean isValidNum(int x){
        int n = x;
        while (x > 0){
            int digit = x % 10;
            if (digit == 0) return false;
            else if (n%digit != 0) return false;
            x = x / 10; // get the next digit
        }
        return true;
    }

    public static void main(String[] args) {
        SelfDividingNumbers self = new SelfDividingNumbers();
        int left = 1, right = 22;

        System.out.println(self.selfDividingNumbers(left,right));
    }
}
