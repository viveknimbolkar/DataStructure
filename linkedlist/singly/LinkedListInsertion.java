package linkedlist.singly;

import predefined.Node;
// https://practice.geeksforgeeks.org/problems/linked-list-insertion-1587115620/1/
public class LinkedListInsertion {

    Node insertAtBeg(Node head, int x){
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
        return head;
    }

    Node insertAtEnd(Node head, int x){
        Node temp = head;
        Node newNode = new Node(x);
        while (temp != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        LinkedListInsertion list = new LinkedListInsertion();
        Node n = new Node();

        n.head = new Node(9);
        n.head.next = new Node(0);
        n.head.next.next = new Node(5);
        n.head.next.next.next = new Node(1);
        n.head.next.next.next.next = new Node(6);
        n.head.next.next.next.next.next = new Node(1);
        n.head.next.next.next.next.next.next = new Node(2);
        n.head.next.next.next.next.next.next.next = new Node(0);
        n.head.next.next.next.next.next.next.next.next = new Node(5);
        n.head.next.next.next.next.next.next.next.next.next = new Node(0);

        n.printList(n.head);
    }
}
