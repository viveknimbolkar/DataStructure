package linkedlist.singly;

public class Node {
    Node head;
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
    Node(){

    }

    void printList(Node head){
        while (head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
}
