package linkedlist.singly;

import predefined.Node;

import java.util.ArrayList;
import java.util.Collections;

// https://leetcode.com/problems/partition-list/
public class PartitionList {

    Node partition(Node head, int x) {
        Node left = new Node(0);
        Node right = new Node(0);

        Node leftTail = left; // list of small element
        Node rightTail = right;// list of large element

        // start building left and right left
        while (head != null){
            if (head.data < x){
                leftTail.next = head;
                leftTail = leftTail.next;
            }else {
                rightTail.next = head;
                rightTail = rightTail.next;
            }
            head = head.next;
        }

        // poin the last node of leftList to rights 2nd node
        leftTail.next = right.next;
        rightTail.next = null;

        return left.next;

    }

    public static void main(String[] args) {
        PartitionList list = new PartitionList();
        Node node = new Node();
        node.head = new Node(1);
        node.head.next = new Node(4);
        node.head.next.next = new Node(3);
        node.head.next.next.next = new Node(2);
        node.head.next.next.next.next = new Node(5);
        node.head.next.next.next.next.next = new Node(2);

        node.printList(list.partition(node.head,3));
    }
}
