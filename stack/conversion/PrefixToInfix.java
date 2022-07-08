package stack.conversion;

import java.util.Stack;

public class PrefixToInfix {

    boolean isOperator(char ch){
        switch (ch){
            case '+':
            case '-':
            case '*':
            case '/': return true;
        }
        return false;
    }

    String prefixToInfix(String exp){

        Stack<String> stack = new Stack<>();

        for (int i = exp.length() -1  ; i >= 0; i--) {
            char currentChar = exp.charAt(i);

            if (isOperator(currentChar)){
                String operator1 = stack.pop();
                String operator2 = stack.pop();
                //concat operator
                String expression = "(" + operator1 + currentChar + operator2 + ")";
                stack.push(expression);
            }else {
                stack.push(currentChar + ""); //to create string and add into stack as a String
            }

        }
        return  stack.pop();
    }

    public static void main(String[] args) {
        PrefixToInfix prefixToInfix = new PrefixToInfix();
        System.out.println(prefixToInfix.prefixToInfix("*-A/BC-/AKL"));
    }
}
