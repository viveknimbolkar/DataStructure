package stack;

import java.util.Stack;

public class ReverseStackUsingRecursion {

    static Stack<Character> st = new Stack<>();

    static void insertAtBottom(char data){
        //check if stack is empty
        if(st.isEmpty()){
            st.push(data);
        }else {
           char a = st.peek();
           st.pop();
           insertAtBottom(data);
           st.push(a);
        }
    }
    //reverse stack main method
    static void reverseStack(){
        if (st.size() > 0){
            char a = st.peek();
            st.pop();
            reverseStack();
            insertAtBottom(a);
        }
    }

    public static void main(String[] args) {

        st.push('a');
        st.push('b');
        st.push('c');
        st.push('d');
        st.push('e');

        System.out.println(st+"\n");
        reverseStack();
        System.out.println(st+"\n");
    }
}
