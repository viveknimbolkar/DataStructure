package queue;
// https://practice.geeksforgeeks.org/problems/stack-using-two-queues/1/
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueue {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    void push(int a){
       while (!q1.isEmpty())
           q2.add(q1.poll());
       q1.add(a);
       while (!q2.isEmpty())
           q1.add(q2.poll());
    }

    int pop(){
        if (!q1.isEmpty()) return q1.poll();
        return -1;
    }

    public static void main(String[] args) {
        StackUsingTwoQueue s = new StackUsingTwoQueue();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.q1);
        s.pop();
        s.pop();
        System.out.println(s.q1);
    }
}
