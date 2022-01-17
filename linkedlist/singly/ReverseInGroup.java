package linkedlist.singly;

import predefined.Node;
// https://practice.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1/
public class ReverseInGroup {

    Node reverseInGroup(Node node, int k) {
        int counter = 0;
        Node prev = null, curr = node, next = null;
        //reverse first k nodes
        while(curr != null && counter < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            counter++;
        }

        // now next contain k+1 node so recursively call a function to reverse
        if (next != null)
            node.next = reverseInGroup(next,k); // pass the k+1 node each time
        return prev; // return prev as head
    }

    public static void main(String[] args) {
        ReverseInGroup reverse = new ReverseInGroup();
        Node n = new Node();

        n.head = new Node(1);
        n.head.next = new Node(2);
        n.head.next.next = new Node(2);
        n.head.next.next.next = new Node(4);
        n.head.next.next.next.next = new Node(5);
        n.head.next.next.next.next.next = new Node(6);
        n.head.next.next.next.next.next.next = new Node(7);
        n.head.next.next.next.next.next.next.next = new Node(8);

        n.printList(reverse.reverseInGroup(n.head,4));
    }
}
