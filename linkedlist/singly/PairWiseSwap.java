package linkedlist.singly;

import predefined.Node;

public class PairWiseSwap {

    Node pairwiseSwap(Node node){
        Node temp = node;
        while (temp != null){
            temp.next = temp.next.next;
            temp.next.next = temp.next;
            System.out.println("temp.next: "+temp.next.data);
            temp = temp.next.next;
        }

        return node;
    }

    public static void main(String[] args) {
        PairWiseSwap pair = new PairWiseSwap();
        Node node = new Node();

        node.head = new Node(1);
        node.head.next = new Node(2);
        node.head.next.next = new Node(2);
        node.head.next.next.next = new Node(4);
        node.head.next.next.next.next = new Node(5);
        node.head.next.next.next.next.next = new Node(6);
        node.head.next.next.next.next.next.next = new Node(7);
        node.head.next.next.next.next.next.next.next = new Node(8);

        node.printList(pair.pairwiseSwap(node.head));
    }
}
