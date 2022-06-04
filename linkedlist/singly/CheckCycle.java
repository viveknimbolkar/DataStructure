package linkedlist.singly;
import predefined.Node;

import java.util.HashSet;

// https://leetcode.com/problems/linked-list-cycle/
public class CheckCycle {

    boolean hasCycle(Node head) {
        HashSet<Node> nodes = new HashSet<>();
        Node temp = head;
        while (temp != null){
            if (nodes.contains(temp)) return true;
            else nodes.add(temp);
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        CheckCycle check = new CheckCycle();
        Node n = new Node();

        n.head = new Node(3);
        n.head.next = new Node(2);
        n.head.next.next = new Node(0);
        n.head.next.next.next = new Node(-4);

        System.out.println(check.hasCycle(n.head));
    }
}
