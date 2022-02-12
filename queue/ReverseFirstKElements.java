package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
// https://practice.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1/
public class ReverseFirstKElements {

    Queue<Integer> reverseKElements(Queue<Integer> q, int k){
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()){
            if (k == 0) break;
            s.push(q.poll());
            k--;
        }
        System.out.println("stack"+s);
        System.out.println("queue"+q);
        Queue<Integer> q2 = new LinkedList<>();

        while (!s.isEmpty())
            q2.add(s.pop());
        while (!q.isEmpty())
            q2.add(q.poll());
        return q2;
    }

    public static void main(String[] args) {
        ReverseFirstKElements reverse = new ReverseFirstKElements();
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);

        System.out.println(reverse.reverseKElements(q,3));
    }
}
