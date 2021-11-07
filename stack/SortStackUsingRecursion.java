package stack;

import java.util.ListIterator;
import java.util.Stack;

public class SortStackUsingRecursion {

    //Insert element into sorted array one by one
    void sortedInsert(Stack<Integer> st, int x){
        if (st.isEmpty() || x > st.peek()){
            st.push(x);
            return;
        }
        // if stack is not empty and x is not greater than stack's top item
        int tempElement = st.pop();
        sortedInsert(st,x); // then sort the
        st.push(tempElement);
    }

    void sortStack(Stack<Integer> stack){
        if (!stack.isEmpty()){
            int x = stack.pop(); //get top element
            sortStack(stack); //now sort the given stack
            sortedInsert(stack,x); //add element into sorted array
        }
    }

    void printStack(Stack<Integer> st){
        ListIterator listIterator = st.listIterator();
        while (listIterator.hasNext())
            System.out.print(listIterator.next()+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        SortStackUsingRecursion sortStackUsingRecursion = new SortStackUsingRecursion();
        Stack<Integer> st = new Stack<>();

        st.push(100);
        st.push(-20);
        st.push(50);
        st.push(34);
        st.push(87);
        st.push(22);

        sortStackUsingRecursion.printStack(st);
        sortStackUsingRecursion.sortStack(st);
        sortStackUsingRecursion.printStack(st);
    }
}
