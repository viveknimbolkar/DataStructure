package array.string;

import java.util.ArrayDeque;

//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
public class RemoveAllAdjacentDuplicatesInString {

    String removeDuplicates(String s) {
        ArrayDeque<Character> arrayDeque = new ArrayDeque<>();

        // if previous char is same as curr char then remove previous char
        for (char ch: s.toCharArray()) {
            // remove previous char
            if (!arrayDeque.isEmpty() && arrayDeque.peekLast() == ch)
                arrayDeque.pollLast();
            else arrayDeque.offer(ch); // else add the current char into dequeue
        }

        // build the final string
        StringBuilder sb = new StringBuilder();
        for (char ch: arrayDeque) {
            sb.append(ch);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        RemoveAllAdjacentDuplicatesInString remove = new RemoveAllAdjacentDuplicatesInString();
        String s = "abbaca";
        System.out.println(remove.removeDuplicates(s));
    }
}
