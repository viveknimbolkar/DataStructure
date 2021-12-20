package linkedlist.singly;
// https://practice.geeksforgeeks.org/problems/identical-linked-lists/1/
public class IdenticalLinkedList {

    boolean areIdenticalLists(Node head1, Node head2){
        while (head1 != null && head2 != null){
            if (head1.data != head2.data)
                return false;
            head1 = head1.next;
            head2 = head2.next;
        }
        return true;
    }

    public static void main(String[] args) {
        IdenticalLinkedList identical = new IdenticalLinkedList();
        Node n = new Node();
        Node n2 = new Node();
        n.head = new Node(1);
        n.head.next = new Node(2);
        n.head.next.next = new Node(3);
        n.head.next.next.next = new Node(4);
        n.head.next.next.next.next = new Node(5);
        n.head.next.next.next.next.next = new Node(6);

        n.printList(n.head);

        n2.head = new Node(11);
        n2.head.next = new Node(12);
        n2.head.next.next = new Node(13);
        n2.head.next.next.next = new Node(14);
        n2.head.next.next.next.next = new Node(15);
        n2.head.next.next.next.next.next = new Node(16);

        n2.printList(n2.head);

        System.out.println("Identical: "+identical.areIdenticalLists(n.head,n2.head));
    }
}
