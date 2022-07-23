package linkedlist.singly;

import predefined.Node;
// https://practice.geeksforgeeks.org/problems/reverse-a-sublist-of-a-linked-list/1/
public class ReverseSublist {

    Node reverseList(Node head){
        Node curr = head, prev = null, nextNode = null;
        while (curr != null){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    // Method-1
    Node reverseBetween2(Node head, int n, int m){
        if (head == null) return null;
        Node curr = head, prev = null;
        int count = 1;

        // get the starting node
        while (m != count){
            prev = curr;
            curr = curr.next;
            count++;
        }
        Node startNode = curr;

        // get the last node of sublist to reverse
        while (n != count){
            curr = curr.next;
            count++;
        }

        Node end = curr.next;
        curr.next = null;

        // reverse the sublist
        Node newlist = reverseList(startNode);

        // point the prev of sublist to newlist
        if (prev != null){
            prev.next = newlist;
        }

        // get the end node of newlist
        curr = newlist;
        while (curr.next != null){
            curr = curr.next;
        }

        // point the end node of newlist to remain ended list
        curr.next = end;

        if (m == 1) return newlist;
        else return head;

    }

    // Method 2
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

        // reverse nodes incremently
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

        int m = 2, n = 4;
        node.printList(reverse.reverseBetween2(node.head, n, m));
    }
}
