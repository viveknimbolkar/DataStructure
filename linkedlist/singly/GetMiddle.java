package linkedlist.singly;

import predefined.Node;

public class GetMiddle {

    int getMiddle(Node head){
        Node slow = head, fast = head;

        while (fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    public static void main(String[] args) {
        Node node = new Node();
        GetMiddle mid = new GetMiddle();

        node.head = new Node(1);
        node.head.next = new Node(2);
        node.head.next.next = new Node(3);
        node.head.next.next.next = new Node(4);
        node.head.next.next.next.next = new Node(5);
        System.out.println(mid.getMiddle(node.head));

    }
}
