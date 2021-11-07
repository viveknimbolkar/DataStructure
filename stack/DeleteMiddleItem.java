package stack;
// https://www.geeksforgeeks.org/delete-middle-element-stack/
import java.util.Stack;

public class DeleteMiddleItem {

    void deleteMiddleItem(Stack<Integer> st, int stackSize, int currentItem){
        if (st.isEmpty() || currentItem == stackSize)
            return;

        int temp = st.pop();
        deleteMiddleItem(st,stackSize,currentItem+1); // increment term of stack

        //get the middle element
        if (currentItem != (stackSize /2))
            st.push(temp);
    }

    public static void main(String[] args) {
        DeleteMiddleItem deleteMiddleItem = new DeleteMiddleItem();
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        deleteMiddleItem.deleteMiddleItem(stack, stack.size(), 0);

        //print stack elements
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}
