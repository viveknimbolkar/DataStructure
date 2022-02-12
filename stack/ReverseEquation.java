package stack;

import java.util.Stack;

// https://practice.geeksforgeeks.org/problems/reversing-the-equation2205/1/
public class ReverseEquation {

    String reverseEqn(String S){
        String result = "", digit = "";

        for (int i = 0; i < S.length(); i++) {
           if (isSymbol(S.charAt(i))){
               result = S.charAt(i) + digit + result;
               digit = "";
           }else {
               digit += S.charAt(i);
           }
        }
        result = digit + result;

        return result;
    }

    boolean isDigit(Character ch){
        switch (ch){
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9': return true;
            default: return false;
        }
    }

    boolean isSymbol(Character ch){
        switch (ch){
            case '+':
            case '-':
            case '*':
            case '/':
            case '%': return true;
            default: return false;
        }
    }
    public static void main(String[] args) {
        ReverseEquation rev = new ReverseEquation();
        String eqn = "20-3+5*2";
        System.out.println(rev.reverseEqn(eqn));
    }
}
