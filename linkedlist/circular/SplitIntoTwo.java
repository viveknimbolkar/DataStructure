package linkedlist.circular;

import predefined.Node;
// https://practice.geeksforgeeks.org/problems/split-a-circular-linked-list-into-two-halves/1/
public class SplitIntoTwo {

    void splitList(Node node){



    }

    public static void main(String[] args) {
        Node node = new Node();
        SplitIntoTwo split = new SplitIntoTwo();

        node.head = new Node(2);
        node.head.next = new Node(6);
        node.head.next.next = new Node(1);
        node.head.next.next.next = new Node(5);
        node.head.next.next.next.next = new Node(7);
        node.head.next.next.next.next.next = node.head;

        node.printCircularList();
        split.splitList(node.head);
    }
}
