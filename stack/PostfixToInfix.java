package stack;

import java.util.Stack;

public class PostfixToInfix {

    String postfixToInfix(String exp){
        Stack<String> stack = new Stack<>();

        for (int i = 0; i <exp.length() ; i++) {
            char currentchar = exp.charAt(i);

            if (Character.isLetterOrDigit(currentchar)){
                // if it is operand
                stack.push(currentchar+"");
            }else {
                String ope1 = stack.peek();
                stack.pop();
                String ope2 = stack.peek();
                stack.pop();

                String tempstr = '('+ope2+currentchar+ope1+')';
                stack.push(tempstr);
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {
        PostfixToInfix postfixToPrefix = new PostfixToInfix();

        System.out.println(postfixToPrefix.postfixToInfix("ab*c+"));
    }
}
