package linkedlist.singly;

import predefined.Node;
// https://practice.geeksforgeeks.org/problems/delete-without-head-pointer/1/
public class DeleteWithoutHead {

    void deleteWithoutHead(Node delete){
       delete.data = delete.next.data;
       delete.next = delete.next.next;
    }

    public static void main(String[] args) {
        Node node = new Node();
        DeleteWithoutHead delete = new DeleteWithoutHead();

        node.head = new Node(1);
        node.head.next = new Node(2);
        node.head.next.next = new Node(3);;;;;;;;
        node.head.next.next.next = new Node(4);
        node.head.next.next.next.next = new Node(5);
        node.head.next.next.next.next.next = new Node(6);
        node.head.next.next.next.next.next.next  = new Node(7);

        delete.deleteWithoutHead(node.head.next);
        node.printList(node.head);
    }
}
