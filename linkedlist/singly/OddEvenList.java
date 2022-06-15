package linkedlist.singly;
// https://leetcode.com/problems/odd-even-linked-list/
import predefined.Node;

import java.util.ArrayList;

public class OddEvenList {

    // Method-1:
    Node oddEvenList(Node head, boolean flag){
        Node odd = new Node(0);
        Node temp1 = odd;
        Node even = new Node(0);
        Node temp2 = even;
        int ptr = 1;

        while (head!= null){
            if (ptr%2 != 0){
                Node newNode = new Node(head.data);
                temp1.next = newNode;
                temp1 = temp1.next;
            }else {
                Node newNode = new Node(head.data);
                temp2.next = newNode;
                temp2 = temp2.next;
            }
            head = head.next;
            ptr++;
        }
        temp1.next = even.next;
        return odd.next;
    }

    //Method-2: two pointer approach
    Node oddEvenList(Node head) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        Node temp = head;

        // store odd and even values in separate arrays
        while (temp != null){
            if (temp.data % 2 == 0){
                even.add(temp.data);
            }else if(temp.data % 2 != 0) odd.add(temp.data);
            temp = temp.next;
        }

        // change the original list with odd even values
        temp = head;
        // add odd numbers
        int i = 0, j = 0;
        while (temp != null && i < odd.size()){
            if (odd.isEmpty()) break;
            temp.data = odd.get(i++);
            temp = temp.next;
        }
        // add even no.
        while (temp != null && j < even.size()){
            if (even.isEmpty()) break;
            temp.data = even.get(j++);
            temp = temp.next;
        }

        return head;
    }

    public static void main(String[] args) {
        OddEvenList odd = new OddEvenList();

        Node n = new Node();
        n.head = new Node(1);
        n.head.next = new Node(2);
        n.head.next.next = new Node(3);
        n.head.next.next.next = new Node(4);
        n.head.next.next.next.next = new Node(5);

        n.printList(odd.oddEvenList(n.head,true));
    }
}
