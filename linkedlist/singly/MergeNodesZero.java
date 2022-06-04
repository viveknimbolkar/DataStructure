package linkedlist.singly;
import predefined.Node;
// https://leetcode.com/problems/merge-nodes-in-between-zeros/
public class MergeNodesZero {

    Node mergeNodes(Node head) {
        Node node = head.next;
        // create a dummy node
        Node newNode = new Node(0);
        Node dummy = newNode;
        int sum = 0;

        while (node != null){
            // if node is zero then add the sum and new node in dummy node
            if (node.data == 0){
                Node n = new Node(sum);
                newNode.next = n;
                newNode = n;
                sum = 0;
            }
            // keep tract of sum of nodes uptil now
            sum += node.data;
            node = node.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        MergeNodesZero merge = new MergeNodesZero();
        Node n = new Node();
        n.head = new Node(0);
        n.head.next = new Node(3);
        n.head.next.next = new Node(1);
        n.head.next.next.next = new Node(0);
        n.head.next.next.next.next = new Node(4);
        n.head.next.next.next.next.next = new Node(5);
        n.head.next.next.next.next.next.next = new Node(2);
        n.head.next.next.next.next.next.next.next = new Node(0);

        n.printList(merge.mergeNodes(n.head));

    }
}
