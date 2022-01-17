package linkedlist.singly;

import predefined.Node;
// https://practice.geeksforgeeks.org/problems/reorder-list/1/
public class ReorderList {

    Node reorderList(Node head){
       Node mid = getMid(head);
      return reverseList(head);

    }

    Node reverseList(Node node){
        Node prev = null, current = node;
        while (current != null){
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return node;
    }

    Node getMid(Node node){
        Node slow = node, fast = node;
        while (fast.next != null && fast.next.next  != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ReorderList reorderList = new ReorderList();
        Node n = new Node();    

        n.head = new Node(1);
        n.head.next = new Node(7);
        n.head.next.next = new Node(3);
        n.head.next.next.next = new Node(4);
        n.head.next.next.next.next = new Node(9);
        n.head.next.next.next.next.next = new Node(2);

        reorderList.reorderList(n.head);
        n.printList();
    }
}
