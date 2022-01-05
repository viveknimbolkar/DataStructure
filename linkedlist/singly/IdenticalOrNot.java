package linkedlist.singly;
// https://practice.geeksforgeeks.org/problems/identical-linked-lists/1/

import predefined.Node;

public class IdenticalOrNot {

    public boolean isIdentical(Node head1, Node head2){
        boolean result = true;

        Node temp1 = head1, temp2 =  head2;

        while (temp1 != null && temp2 != null){
            result = temp1.data == temp2.data;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return result;
    }



    public static void main(String[] args) {
        IdenticalOrNot identical = new IdenticalOrNot();
        Node list1 = new Node();
        Node list2 = new Node();

        list1.head = new Node(1);
        list1.head.next = new Node(2);
        list1.head.next.next = new Node(3);
        list1.head.next.next.next = new Node(4);
        list1.head.next.next.next.next = new Node(5);
        list1.head.next.next.next.next.next = new Node(6);

        list1.head = new Node(1);
        list1.head.next = new Node(2);
        list1.head.next.next = new Node(3);
        list1.head.next.next = new Node(4);
        list1.head.next.next.next = new Node(5);
        list1.head.next.next.next.next = new Node(6);

//        list2.head = new Node(99);
//        list2.head.next = new Node(59);
//        list2.head.next.next = new Node(42);
//        list2.head.next.next.next = new Node(20);

        System.out.println(identical.isIdentical(list1.head, list2.head));


    }
}
