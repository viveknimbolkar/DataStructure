package stack;
// O(n)
import java.util.Stack;

public class ReverseString {

    void reverseString(String str){
        Stack<Character> stack = new Stack<>();

        //add character into stack
        for (int i = 0; i <str.length() ; i++) {
                stack.push(str.charAt(i));
        }

        String letter = "";
        String reverse = "";

        //iterator until stack become empty
        while (!stack.isEmpty()){
            //if the top most element of stack letter is char then add into letter else add into reverse
            if (Character.isLetter(stack.peek())) {
                letter = letter + stack.pop();
            } else {
                reverse = " "+letter+reverse; //if it is space add everything into reverse
                letter = ""; //make letter empty
                stack.pop();
            }
        }

        //if letter is not empty
        if (letter != "")
            reverse = letter + reverse;

        System.out.println(reverse);

    }

    public static void main(String[] args) {
        String name = "Vivek Nimbolkar";
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString(name);
    }
}
