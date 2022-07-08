package stack.conversion;

import java.util.Stack;

public class PrefixToPostfix {

    boolean isOperator(char ch){
        switch (ch){
            case '+':
            case '-':
            case '*':
            case '/': return true;
        }
        return false;
    }

    String prefixToPostfix(String exp){
        Stack<String> stack = new Stack<>();
        for (int i = exp.length() - 1; i <= 0 ; i--) {
            char currentchar = exp.charAt(i);
            //if it is a operator then pop two operands from stack
            if (isOperator(currentchar)){
                String operator1 = stack.peek();
                stack.pop();
                String operator2 = stack.peek();
                stack.pop();
                //concat operators
                String tempString = operator1 + operator2 + currentchar;
                stack.push(tempString);
            }else {
                //if symbol is an operand simpli push it into stack
                stack.push(currentchar+"");// make it string
            }
        }
        return stack.peek(); //return postfix expresion
    }
    public static void main(String[] args) {
        PrefixToInfix prefixToInfix = new PrefixToInfix();
        System.out.println(prefixToInfix.prefixToInfix("*-A/BC-/AKL"));
    }
}
