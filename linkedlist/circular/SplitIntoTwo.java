package linkedlist.circular;

import predefined.Node;
// https://practice.geeksforgeeks.org/problems/split-a-circular-linked-list-into-two-halves/1/
public class SplitIntoTwo {

    void splitList(Node node){
        Node n1 , n2, slow = node, fast = node;

        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // if list is of even no.
        if (fast.next.next == node){
            fast = fast.next;
        }

        n1 = node.head;
        if(node.next != node){
            n2 = slow.next;
        }
        fast.next = slow.next;
        slow.next = node;
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
        node.printCircularList();
    }
}
