package stack;
// O(n)
import java.util.Stack;

public class QueueUsingStack {

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public void enQueue(int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int deQueue(){
        if(s1.isEmpty()) return 0;
        int popElement = s1.peek();
        s1.pop();
        return popElement;
    }

    public static void main(String[] args) {
        QueueUsingStack queueUsingStack = new QueueUsingStack();
        queueUsingStack.enQueue(10);
        queueUsingStack.enQueue(20);
        queueUsingStack.enQueue(30);
        queueUsingStack.enQueue(40);
        queueUsingStack.enQueue(50);
        queueUsingStack.enQueue(60);

        System.out.println(queueUsingStack.deQueue());
    }
}
