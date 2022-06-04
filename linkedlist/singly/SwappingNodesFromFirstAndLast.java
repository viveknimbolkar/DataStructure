package linkedlist.singly;
import predefined.Node;

import java.util.Stack;

// https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
public class SwappingNodesFromFirstAndLast {
    Node swapNodes(Node head, int k) {
        Node slow = head, fast = head;
        int ptr = 1;

        // get first node
        while(ptr < k){
            fast = fast.next;
            ptr++;
        }

        Node tempFirstNode = fast;

        // get the last node
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        // swap data
        int temp = tempFirstNode.data;
        tempFirstNode.data = slow.data;
        slow.data = temp;

        return head;
    }

    public static void main(String[] args) {
        SwappingNodesFromFirstAndLast swap = new SwappingNodesFromFirstAndLast();
        Node n = new Node();

        n.head = new Node(1);
        n.head.next = new Node(2);
        n.head.next.next = new Node(3);
        n.head .next.next.next = new Node(4);
        n.head.next.next.next.next = new Node(5);

        n.printList(swap.swapNodes(n.head,2));
    }
}
