package stack;

class StackNode{
    int data;
    StackNode next;
    StackNode(int item){
        this.data = item;
        this.next = null;
    }
}

class StackOperations {

   StackNode top;

    void push(int item){
        //if stack is empty
       if (this.top == null){
           StackNode stack = new StackNode(item);
           this.top = stack;
           return;
       }
       //adding stack item at the top
       StackNode stackNode = new StackNode(item);
       stackNode.next = this.top; //setting next of stacknode to peek item
       this.top = stackNode; // setting stackNode as the top of stack
    }

    int pop(){
        StackNode stackNode = this.top;
        this.top = this.top.next;
        return stackNode.data;
    }

    void displayStack(StackNode stackNode){
        while (stackNode != null){
            System.out.print(stackNode.data+" ");
            stackNode = stackNode.next;
        }
        System.out.println();
    }

    // use reverse linked list logic
    void reverseStack(){
        StackNode current, previous, nextnode;
        current = previous = this.top; // make top element as curr and previous node
        current = current.next; // increment current
        previous.next = null;

        // REverse the list one by one
        while (current != null){
            nextnode = current.next;
            current.next = previous;
            previous = current;
            current = nextnode;
        }
        this.top = previous;
    }
}

public class ReverseStackWithoutRecursion{
    public static void main(String[] args) {
        StackOperations stack = new StackOperations();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.displayStack(stack.top);
        stack.reverseStack();
        stack.displayStack(stack.top);
    }
}
