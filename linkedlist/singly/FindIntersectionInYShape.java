package linkedlist.singly;

import predefined.Node;
// https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1/
public class FindIntersectionInYShape {

    int intersectPoint(Node head1, Node head2) {
       Node temp1 = head1;
       Node temp2 = head2;

        while (temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
            if (temp1 == null){
                temp1 = head2;
                temp1 = temp1.next;
            }
            if(temp2 == null){
                temp2 = head1;
                temp2 = temp2.next;
            }
        }
        return temp1.data;
    }

    //

    public static void main(String[] args) {
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        FindIntersectionInYShape find = new FindIntersectionInYShape();

        n1.head = new Node(4);
        n1.head.next = new Node(1);
        n1.head.next.next = n3.head;

        n2.head = new Node(5);
        n2.head.next = new Node(6);
        n2.head.next.next = new Node(1);
        n2.head.next.next.next = n3.head;

        n3.head = new Node(8);
        n3.head.next = new Node(4);
        n3.head.next.next = new Node(5);


        n1.printList();
        n2.printList();
        n3.printList();

        System.out.println("Intersection point: "+find.intersectPoint(n1.head, n2.head));

    }
}
