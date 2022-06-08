package linkedlist.singly;
import predefined.Node;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicates_2 {

    Node deleteDuplicates(Node head) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node temp = head, prev = dummy;

        while(temp != null){
            // check if duplicate is present at head.
            while(temp.next != null && temp.next.data == temp.data){
                temp = temp.next;
            }
            // check current position with previous node.
            if(prev.next  == temp){
                prev = prev.next;
            }else prev.next = temp.next;
            temp = temp.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        RemoveDuplicates_2 rm = new RemoveDuplicates_2();
        Node n = new Node();
        n.head = new Node(1);
        n.head.next = new Node(2);
        n.head.next.next = new Node(3);
        n.head.next.next.next = new Node(3);
        n.head.next.next.next.next = new Node(4);
        n.head.next.next.next.next.next = new Node(4);
        n.head.next.next.next.next.next.next = new Node(5);

        n.printList(rm.deleteDuplicates(n.head));
    }
}
