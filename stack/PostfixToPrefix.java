package stack;

import java.util.Stack;

public class PostfixToPrefix {

    boolean isOperator(char ch){
        switch (ch){
            case '+':
            case '-':
            case '*':
            case '/': return  true;
        }
        return false;
    }

    String postfixToPrefix(String exp){
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char currentChar = exp.charAt(i);

            if (isOperator(currentChar)){
                String operator1 = stack.peek();
                stack.pop();

                String operator2 = stack.peek();
                stack.pop();

                String tempstr = currentChar + operator1 + operator2; // prefix expression

                stack.push(tempstr);
            }else {
                //if it is no an operator
                stack.push(currentChar+""); // converting char into string
            }
        }
        //concat all string in stack and return them
        String result = "";
        for (String expression: stack) {
            result += expression;
        }
        return  result;
    }

    public static void main(String[] args) {
        PostfixToPrefix postfixToPrefix = new PostfixToPrefix();
        System.out.println(postfixToPrefix.postfixToPrefix("ABC/-AK/L-*"));
    }
}
