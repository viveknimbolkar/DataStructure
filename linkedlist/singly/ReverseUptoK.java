package linkedlist.singly;

import predefined.Node;

public class ReverseUptoK {

    Node rotate(Node head, int k){

        for (int i = 0; i < k; i++) {
            Node temp = head, prev = null;

            while (temp.next != null){
                prev = temp;
                temp = temp.next;
            }

            prev.next = null;
            temp.next = head;
            head = temp;
        }
        return head;
    }

    public static void main(String[] args) {
        ReverseUptoK reverseUptoK = new ReverseUptoK();
        Node node = new Node();

        node.head = new Node(2);
        node.head.next = new Node(4);
        node.head.next.next = new Node(7);
        node.head.next.next.next = new Node(8);
        node.head.next.next.next.next = new Node(9);

        Node n = reverseUptoK.rotate(node.head, 2);

        node.printList(n);
    }
}
