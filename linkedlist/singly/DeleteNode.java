package linkedlist.singly;

import predefined.Node;
// https://practice.geeksforgeeks.org/problems/java-collections-set-7-linkedlist/1/
public class DeleteNode {

    void deleteNode(Node node){
        Node temp = node, prev=null;
        if (node.next == null){
            node = null;
        }else {
            node.data = node.next.data;
            node.next = node.next.next;
        }

    }

    public static void main(String[] args) {
        DeleteNode del = new DeleteNode();
        Node n = new Node();
        n.head = new Node(10);
        n.head.next = new Node(20);
        n.head.next.next = new Node(30);
        n.head.next.next.next = new Node(40);
        n.head.next.next.next.next = new Node(50);
        n.printList(n.head);
        del.deleteNode(n.head);
        n.printList(n.head);
    }
}
