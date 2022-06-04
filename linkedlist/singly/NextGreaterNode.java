package linkedlist.singly;
import predefined.Node;

import java.util.ArrayList;

// https://leetcode.com/problems/next-greater-node-in-linked-list/
public class NextGreaterNode {

    int[] nextLargerNodes(Node head) {
        // calculate the size of list and create a array to store next greater value;
        ArrayList<Integer> ans = new ArrayList<>();

        // Find the next greater value from current node
        Node i = head, j = null;
        int max, currVal;
        while (i != null){
            j = i.next;
            currVal = i.data;
            max = currVal;
            while (j != null){
                max = Math.max(max,j.data);
                if (max > currVal)
                    break;
                j = j.next;
            }
            if (max == currVal)
                max = 0;
            ans.add(max);
            i = i.next;
        }

        return ans.stream().mapToInt(a -> a).toArray();
    }

    public static void main(String[] args) {
        NextGreaterNode nextNode = new NextGreaterNode();
        Node n = new Node();

        n.head = new Node(2);
        n.head.next = new Node(7);
        n.head.next.next = new Node(4);
        n.head.next.next.next = new Node(3);
        n.head.next.next.next.next = new Node(5);

        n.printList(n.head);
        for (int x: nextNode.nextLargerNodes(n.head)) {
            System.out.print(x+" ");
        }
    }
}
