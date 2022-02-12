package queue;

import java.util.*;

public class ReverseQueue {

    Queue<Integer> reverseQueue(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();

        while (!q.isEmpty()){
            s.push(q.poll());
        }

        while (!s.isEmpty()){
            q.add(s.pop());
        }
        return q;
    }

    public static void main(String[] args) {
        ReverseQueue reverseQueue = new ReverseQueue();
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
//        System.out.println(q);
        System.out.println(reverseQueue.reverseQueue(q));
    }
}
