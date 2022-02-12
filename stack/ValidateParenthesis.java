package stack;

import predefined.Stack;

// https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1/
public class ValidateParenthesis {

    boolean validatePar(String exp){
        Stack st = new Stack();
        for (int i = 0; i < exp.length(); i++) {
            char getCurrChar = exp.charAt(i);
            char rev = getReversedBracket(getCurrChar);
            if (isLeftBracket(getCurrChar)){
                st.push(getCurrChar);
            }else if (st.isEmpty() || (char)st.pop() != rev){
                return false;
            }
        }
        return st.isEmpty();
    }

    boolean isLeftBracket(char lb){
        switch (lb){
            case '{':
            case '(':
            case '[':return true;
        }
        return false;
    }

    char getReversedBracket(char ch){
        switch (ch){
            case '(': return ')';
            case ')': return '(';
            case '{': return '}';
            case '}': return '{';
            case '[': return ']';
            case ']': return '[';
        }
        return '0';
    }

    public static void main(String[] args) {
        ValidateParenthesis validate = new ValidateParenthesis();
        String exp = "[{}()]";
        System.out.println(validate.validatePar(exp));
    }
}
