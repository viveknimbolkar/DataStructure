package queue;

import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enQueue(int item){
        //move all element from s1 to s2
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        //add item
        s1.push(item);
        //move all element from s2 to s1
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int deQueue(){
        int topItem = s1.peek();
        s1.pop();
        return topItem;
    }

    public static void main(String[] args) {
        QueueUsingStack queueUsingStack = new QueueUsingStack();
        queueUsingStack.enQueue(10);
        queueUsingStack.enQueue(20);
        queueUsingStack.enQueue(30);
        queueUsingStack.enQueue(40);
        queueUsingStack.enQueue(50);

        System.out.println(queueUsingStack.deQueue());
        System.out.println(queueUsingStack.deQueue());
        System.out.println(queueUsingStack.deQueue());
        System.out.println(queueUsingStack.deQueue());
        System.out.println(queueUsingStack.deQueue());
    }
}
