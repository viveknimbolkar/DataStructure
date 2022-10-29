package stack;

import java.util.Stack;

public class DecodeString {

    String decodeString(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch: s.toCharArray()) {
            // if we found ]
            if (ch != ']'){
                stack.push(ch);
            }else{
                // if we found [
                StringBuilder sb = new StringBuilder();
                while (!stack.isEmpty() && Character.isLetter(stack.peek())){
                    sb.insert(0,stack.pop());
                }
                // get the string in []
                    String str = sb.toString();
                stack.pop(); // pop last [

                // find the repetition digit
                sb = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek()))
                    sb.insert(0,stack.pop());
                int number = Integer.parseInt(sb.toString());


                // repeat the string upto number times in []
                while (number > 0){
                    for (char c: str.toCharArray()) {
                        stack.push(c);
                    }
                    number--;
                }
            }
        }

        // construct the final anser in stack
        StringBuilder finalAns = new StringBuilder();
        while (!stack.isEmpty()){
            finalAns.insert(0,stack.pop());
        }
        return finalAns.toString();
    }

    public static void main(String[] args) {
        DecodeString decode = new DecodeString();
        String str = "3[a]2[bc]";
        System.out.println(decode.decodeString(str));
    }
}
