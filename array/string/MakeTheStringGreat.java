package array.string;

import java.util.Stack;

//https://leetcode.com/problems/make-the-string-great/
public class MakeTheStringGreat {

    String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        String ans = "";
        int n = s.length();

        for (int i = 0; i < n; i++) {
            // if difference is 32 then remove it
            if (!stack.isEmpty() && Math.abs(stack.peek() - s.charAt(i)) == 32){
                stack.pop();
            }else {
                stack.push(s.charAt(i));
            }
        }

        // construct string
        while (!stack.isEmpty()){
            ans = stack.pop() + ans;
        }

        return ans;
    }

    public static void main(String[] args) {
        MakeTheStringGreat make = new MakeTheStringGreat();
        String s = "leEeetcode";
        String s1 = "abBAcC";
        System.out.println("Greate string: "+make.makeGood(s));
    }
}
