package linkedlist.singly;

import predefined.Node;

// https://practice.geeksforgeeks.org/problems/delete-middle-of-linked-list/1/
// https://practice.geeksforgeeks.org/problems/delete-middle-of-linked-list/1/

public class DeleteMiddleElement {

    Node deleteMiddleElement(Node head){
        Node slow = head, fast = head, prev=null;

        while (slow != null && fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(prev.data);
        System.out.println(slow.data);

        prev.next = slow.next;

        return head;
    }

    public static void main(String[] args) {
        Node node = new Node();
        DeleteMiddleElement delete = new DeleteMiddleElement();

        node.head = new Node(1);
        node.head.next = new Node(2);
        node.head.next.next = new Node(3);
        node.head.next.next.next = new Node(4);
        node.head.next.next.next.next = new Node(5);
        node.head.next.next.next.next.next = new Node(6);
        node.head.next.next.next.next.next.next  = new Node(7);

        delete.deleteMiddleElement(node.head);
        node.printList(node.head);
    }
}
