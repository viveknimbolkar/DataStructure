package linkedlist.singly;
import predefined.Node;
// https://leetcode.com/problems/remove-linked-list-elements/
public class DeleteGiveNodes {

    Node removeElements(Node head, int val) {
        Node temp = head, prev = null;
        while (temp != null){
            if (temp.data == val){
                prev.next = temp.next;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }

    public static void main(String[] args) {
        DeleteGiveNodes del = new DeleteGiveNodes();
        Node n = new Node();
        n.head = new Node(1);
        n.head.next = new Node(2);
        n.head.next.next = new Node(6);
        n.head.next.next.next = new Node(3);
        n.head.next.next.next.next = new Node(4);
        n.head.next.next.next.next.next = new Node(5);
        n.head.next.next.next.next.next.next = new Node(6);

        n.printList(del.removeElements(n.head,6));

    }
}
