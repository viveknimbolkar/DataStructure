package linkedlist.circular;
// https://practice.geeksforgeeks.org/problems/circular-linked-list-delete-at-position/1/
import predefined.Node;

public class DeleteAtPosition {

    void deleteAtPosition(Node head, int pos){
        Node temp = head, prev = null, nextNode = null;
        int count = 0;

        for (int i = 0; i < pos; i++) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        DeleteAtPosition del = new DeleteAtPosition();
        Node node = new Node();

        node.head = new Node(10);
        node.head.next = new Node(20);
        node.head.next.next = new Node(30);
        node.head.next.next.next = new Node(40);
        node.head.next.next.next.next = new Node(50);
        node.head.next.next .next.next.next= new Node(60);
        node.head.next.next.next.next.next.next = new Node(70);
        node.head.next.next.next.next.next.next.next = node.head;

        node.printList(node.head);
        del.deleteAtPosition(node.head,3);
    }
}
