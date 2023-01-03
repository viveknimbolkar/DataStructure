package problems;

import java.lang.reflect.Array;
import java.util.ArrayList;

//https://leetcode.com/contest/weekly-contest-324/problems/smallest-value-after-replacing-with-sum-of-prime-factors/
public class SumOfPrimeFactors {
    // TODO: Not working
    int smallestValue(int n) {
        System.out.println(getPrimeFactor(n));
        int ans = 0;

        ArrayList<Integer> factors = getPrimeFactor(n);
        if (factors.size() == 1) return 0;

        while (factors.size() > 1){

            int sum = 0;
            for (int i = 0; i < factors.size(); i++) {
                sum += factors.get(i);
            }
            n = sum;
            ans = n;
            System.out.println("fa: "+n);
            factors = getPrimeFactor(n);
        }

        return ans;
    }

    ArrayList<Integer> getPrimeFactor(int n){
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            while ((n%i) == 0){
                factors.add(i);
                n = n/i;
            }
        }
        if(n >2) {
           factors.add(n);
        }

        return factors;
    }

    public static void main(String[] args) {
        SumOfPrimeFactors sum = new SumOfPrimeFactors();
        System.out.println(sum.smallestValue(15));
    }
}
