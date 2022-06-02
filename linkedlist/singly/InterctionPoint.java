package linkedlist.singly;

import predefined.Node;

import java.util.HashSet;
// https://leetcode.com/problems/intersection-of-two-linked-lists/
public class InterctionPoint {
    Node getIntersectionNode(Node headA, Node headB) {
        HashSet<Node> set = new HashSet<>();
        Node temp = headA, temp2 = headB;
        //add first list into set
        while (temp != null){
            set.add(temp);
            temp = temp.next;
        }
        // add second list into set and and check if node is already present is not
        while (temp2 != null){
            if (set.contains(temp2))
                return temp2;
            temp2 = temp2.next;
        }
        return null;
    }


    public static void main(String[] args) {
        InterctionPoint inter = new InterctionPoint();
        Node node = new Node();
        Node node2 = new Node();

        node.head = new Node(4);
        node.head.next = new Node(1);
        node.head.next.next = new Node(8);
        node.head.next.next.next = new Node(4);
        node.head.next.next.next.next = new Node(5);


        node2.head = new Node(5);
        node2.head.next = new Node(6);
        node2.head.next.next = new Node(1);
        node2.head.next.next.next = node.head.next.next.next.next;

        node.printList(node2.head);
        System.out.println(inter.getIntersectionNode(node.head,node2.head));
    }
}
