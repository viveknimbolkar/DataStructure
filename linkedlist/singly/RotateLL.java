package linkedlist.singly;
// https://practice.geeksforgeeks.org/problems/rotate-a-linked-list/1/
import predefined.Node;

public class RotateLL {

    Node rotate(Node node, int k){
        if (node == null || k == 0) return null;

        Node temp = node;
        int counter = 1;
        while (temp != null && counter < k){
            counter++;
            temp = temp.next;
        }
        Node kNode = temp;
        while (temp.next != null)
            temp = temp.next;

        temp.next = node;
        node = kNode.next;
        kNode.next = null;
        return node;
    }

    public static void main(String[] args) {
        RotateLL rote = new RotateLL();
        Node n = new Node();

        n.head = new Node(2);
        n.head.next = new Node(4);
        n.head.next.next = new Node(7);
        n.head.next.next.next = new Node(8);
        n.head.next.next.next.next = new Node(9);

        n.printList(rote.rotate(n.head,3));
    }
}
