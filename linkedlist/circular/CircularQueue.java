package linkedlist.circular;
import predefined.Node;

import java.util.LinkedList;

// https://leetcode.com/problems/design-circular-queue/
public class CircularQueue {
    LinkedList<Integer> list = new LinkedList<>();
    int size;
    CircularQueue(int k) {
        this.size = k;
    }
    CircularQueue() {}

    boolean enQueue(int value) {
        return list.add(value);
    }

    boolean deQueue() {
        return list.remove(this);
    }

    int Front() {
        return list.pop();
    }

    int Rear() {
        return list.poll();
    }

    boolean isEmpty() {
        return list.isEmpty();
    }

    boolean isFull() {
        return list.size() > size;
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue();
        
    }
}
