package stack;

import java.util.Stack;

// https://leetcode.com/problems/remove-outermost-parentheses/
public class RemoveOutermostParenthesese {

    String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // add all the opening braces
            if (ch == '('){
                if (!st.isEmpty()) {
                    ans.append(ch);
                }
                st.push(ch);
            }else { // remove all closing braces if stack is not empty
                st.pop();
                if (!st.isEmpty())
                    ans.append(ch);
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        RemoveOutermostParenthesese remove = new RemoveOutermostParenthesese();
        String s = "(()())(())(()(()))";

        System.out.println(remove.removeOuterParentheses(s));
    }
}
