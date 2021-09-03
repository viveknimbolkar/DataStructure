package linkedlist.circular;

public class CircularLinkedList {
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int data){this.data = data;}
    }

    static void printList(Node node){
        Node temp = node;
        if (node != null) {
            do {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }while (temp != node);
        }
    }


    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();

        circularLinkedList.head = new Node(10);
        circularLinkedList.head.next = new Node(20);
        circularLinkedList.head.next.next = new Node(30);
        circularLinkedList.head.next.next.next = new Node(40);
        circularLinkedList.head.next.next.next.next = new Node(50);
        circularLinkedList.head.next.next .next.next.next= new Node(60);
        circularLinkedList.head.next.next.next.next.next.next = new Node(70);
        circularLinkedList.head.next.next.next.next.next.next.next = circularLinkedList.head;

        printList(circularLinkedList.head);
    }
}
