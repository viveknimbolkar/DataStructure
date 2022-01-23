package linkedlist.singly;

import predefined.Node;
// https://practice.geeksforgeeks.org/problems/reverse-a-sublist-of-a-linked-list/1/
public class ReverseSublist {

    Node reverseBetween(Node head, int n, int m){
        if(head == null || m == n) return head;

        Node dummy = new Node(0);
        dummy.next = head;
        Node newList = dummy;
        int pos = 1;
        while( pos < m){
            newList = newList.next;
            pos++;
        }

        Node workNode = newList.next;

        while(m < n){
            Node temp = workNode.next;
            workNode.next = temp.next;
            temp.next = newList.next;
            newList.next = temp;
            m++;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ReverseSublist reverse = new ReverseSublist();
        Node node = new Node();

        node.head = new Node(1);
        node.head.next = new Node(2);
        node.head.next.next = new Node(3);
        node.head.next.next.next = new Node(4);
        node.head.next.next.next.next = new Node(5);
        node.head.next.next.next.next.next = new Node(6);

        int n = 4, m = 2;
        node.printList(reverse.reverseBetween(node.head, n, m));
    }
}
