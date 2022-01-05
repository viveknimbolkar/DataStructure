package linkedlist.singly;

import predefined.Node;

public class NthNodeFromLast {

    int getNthNodeFromLast(Node head, int n){
        Node temp = head;
        int i = 0, nthNode = getSum(head) - n;

        if (nthNode == 0)
            return head.data;

        //iterate and compare each time the value of i and nthNode
        while (temp != null){
            if (i == nthNode)
                return temp.data;
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // get the size of whole list
    int getSum(Node head){
        Node temp = head;
        int counter = 0;
        while (temp != null){
            counter++;
            temp = temp.next;
        }
        return counter;
    }

    public static void main(String[] args) {
        NthNodeFromLast nth = new NthNodeFromLast();
        Node node = new Node();

        node.head = new Node(1);
        node.head.next = new Node(2);
        node.head.next.next = new Node(3);
        node.head.next.next.next = new Node(4);
        node.head.next.next.next.next = new Node(5);
        node.head.next.next.next.next.next = new Node(6);
        node.head.next.next.next.next.next.next = new Node(7);
        node.head.next.next.next.next.next.next.next = new Node(8);
        node.head.next.next.next.next.next.next.next.next = new Node(9);

        node.printList(node.head);


        System.out.println(nth.getNthNodeFromLast(node.head, 2));
    }
}
