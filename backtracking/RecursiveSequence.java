package backtracking;

import java.util.ArrayList;

//https://practice.geeksforgeeks.org/problems/recursive-sequence1611/1?
public class RecursiveSequence {

    long sequence(int N){
       return findSequence(N,0,1);
    }

    long findSequence(int n, int last, int upto) {
        if (upto > n) return 0;
        else{
            int multi = 1;
            for (int i = 1; i <= upto; i++) {
                last += 1;
                multi *= last;
            }
            multi+=findSequence(n,last,upto+1);
            return multi;
        }
    }


    public static void main(String[] args) {
        RecursiveSequence recur = new RecursiveSequence();
        int n = 5;
        System.out.println(recur.sequence(n));
    }
}
