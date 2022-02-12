package stack;

import java.util.ArrayList;
import java.util.Stack;
// https://practice.geeksforgeeks.org/problems/print-bracket-number4058/1

public class PrintBracketNumber {

    ArrayList<Integer> bracketNumbers(String exp) {
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int counter = 0;

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch =='('){
                counter++;
                s.push(counter);
                arr.add(counter);
            }else if (ch == ')'){
                arr.add(s.pop());
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        PrintBracketNumber print = new PrintBracketNumber();
        String str = "(aa(bdc))p(dee)";
        System.out.println(print.bracketNumbers(str));
    }
}
