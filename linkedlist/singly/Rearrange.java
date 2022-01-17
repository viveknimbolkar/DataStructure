package linkedlist.singly;

import predefined.Node;

public class Rearrange {

    void rearrangeEvenOdd(Node head){

        Node odd = head, even = head.next, temp = even;
        while(even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = temp;
    }

    public static void main(String[] args) {
        Rearrange arrange = new Rearrange();
        Node node = new Node();

        node.head = new Node(1);
        node.head.next = new Node(2);
        node.head.next.next = new Node(3);
        node.head.next.next.next = new Node(4);
        node.head.next.next.next.next = new Node(5);
//        node.head.next.next.next.next.next = new Node(6);

        arrange.rearrangeEvenOdd(node.head);
        node.printList();
    }
}
