package linkedlist.circular;

import predefined.Node;

// https://practice.geeksforgeeks.org/problems/split-a-circular-linked-list-into-two-halves/1/
public class SplitIntoTwo {

    void splitList(Node node){
        Node slow = node, fast = node;

        do{
            slow = slow.next;
            fast = fast.next.next;
        }while (fast != node);

        System.out.println("slow "+slow.data);
        System.out.println("fast "+fast.data);
    }

    public static void main(String[] args) {
        Node node = new Node();
        SplitIntoTwo split = new SplitIntoTwo();

        node.head = new Node(2);
        node.head.next = new Node(6);
        node.head.next.next = new Node(1);
        node.head.next.next.next = new Node(5);
        node.head.next.next.next.next = node.head;

        split.splitList(node.head);
    }
}
