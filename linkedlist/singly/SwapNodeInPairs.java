package linkedlist.singly;
// https://leetcode.com/problems/swap-nodes-in-pairs/
import predefined.Node;
public class SwapNodeInPairs {

    Node swapPairs(Node head) {
        if (head == null || head.next == null) return null;
        Node firstNode = head;
        Node secondNode = head.next;

        Node remainingList = swapPairs(secondNode.next); // get remain list recursively
        secondNode.next = firstNode;
        firstNode.next = remainingList;

        return secondNode;
    }

    public static void main(String[] args) {
        SwapNodeInPairs swap = new SwapNodeInPairs();
        Node n = new Node();

        n.head = new Node(1);
        n.head.next = new Node(2);
        n.head.next.next = new Node(3);
        n.head.next.next.next = new Node(4);

        n.printList(swap.swapPairs(n.head));
    }
}
