package linkedlist.singly;

import predefined.Node;
// https://practice.geeksforgeeks.org/problems/insert-in-a-sorted-list/1/
public class SortedInsert {

    Node sortedInsert(Node head, int key){
        Node current = head;
        Node newNode = new Node(key);

        //if list is empty
        if (head == null) return newNode;

        if (head.data > key){
            newNode.next = head;
            return head;
        }

        while (current.next != null && current.next.data < key){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;

        return head;
    }

    public static void main(String[] args) {
        SortedInsert sorted = new SortedInsert();
        Node node = new Node();

        node.head = new Node(25);
        node.head.next = new Node(36);
        node.head.next.next = new Node(47);
        node.head.next.next.next = new Node(58);
        node.head.next.next.next.next = new Node(69);
        node.head.next.next.next.next.next = new Node(80);

        node.printList(sorted.sortedInsert(node.head, 50));
    }
}
