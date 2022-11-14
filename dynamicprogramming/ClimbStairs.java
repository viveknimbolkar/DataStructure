package dynamicprogramming;

import java.util.Stack;
// https://leetcode.com/problems/climbing-stairs/
public class ClimbStairs {

    // using stack
    int climbStairs(int stairs, boolean label){
        Stack<Integer> st = new Stack<>();
        if (stairs <= 2) return stairs;
            st.push(1); // for first stair
            int current = 2;
            while (stairs <= 2){
                current = st.pop() + st.push(current); // add the
                stairs--;
            }
        return current;
    }

    // using recursion
    int climbStairs(int stairs){
        if (stairs == 0) return stairs;
        if (stairs == 1) return 1;

        int left = climbStairs(stairs-1);
        int right = climbStairs(stairs-2);
        return left+right;
    }

    public static void main(String[] args) {
        ClimbStairs climb = new ClimbStairs();
        int stairs = 3;
        System.out.println("Stairs can be climbed by "+climb.climbStairs(stairs)+" ways.");
    }
}
