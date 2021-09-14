package queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    int current_size;// current size of stack

    StackUsingQueue(){
        current_size = 0;
    }

    void push(int x){
        current_size++;
        q2.add(x);
        //move all elements from q1 to q2
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.remove(); //remove elemtns in q1
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    void pop(int x){
        if (q2.isEmpty()) return;
        q1.remove();
        current_size--;
    }

    int size(){
        return current_size;
    }

    public static void main(String[] args) {
        StackUsingQueue stackUsingQueue = new StackUsingQueue();
        stackUsingQueue.push(10);
        stackUsingQueue.push(20);
        stackUsingQueue.push(30);
        stackUsingQueue.push(40);
        stackUsingQueue.push(50);

        System.out.println("size: "+stackUsingQueue.size());
        System.out.println(stackUsingQueue.q1.peek()+" is removed");
    }


}
