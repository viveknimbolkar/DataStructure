package linkedlist.singly;
// https://practice.geeksforgeeks.org/problems/circular-linked-list/1/
public class CheckCircularList {

    boolean isCircular(Node head){
        Node temp = head;
        while (head != null){
            if (head.next == temp)
                return true;
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node node = new Node();
        CheckCircularList check = new CheckCircularList();
        node.head = new Node(1);
        Node two = new Node(2);
        Node three = new Node(2);
        Node four = new Node(3);
        Node five = new Node(4);
        Node six = new Node(5);

        node.head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;

        node.printList(node.head);
        System.out.println("Circular: "+check.isCircular(node.head));
    }
}
