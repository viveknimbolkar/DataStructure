package linkedlist.singly;

import predefined.Node;

import java.util.HashSet;

// https://practice.geeksforgeeks.org/problems/find-length-of-loop/1/
public class FindLengthOfLoop {

    int countNodesinLoop(Node head){
        Node slow = head, fast = head;
// use two pointer the moment slow == fast that is the starting node of loop
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            // here in slow we get starting node of loop
            if (slow == fast){
                int counter = 0;
                //now count upto the end of loop
                while (slow != null){
                    counter++;
                    slow = slow.next;
                    //terminate when we hit starting node of loop again
                    if (slow == fast)
                        return counter;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        FindLengthOfLoop find = new FindLengthOfLoop();
        Node n = new Node();

        n.head = new Node(25);
        n.head.next = new Node(14);
        n.head.next.next = new Node(19);
        n.head.next.next.next = new Node(33);
        n.head.next.next.next.next = new Node(10);
        n.head.next.next.next.next.next = new Node(21);
        n.head.next.next.next.next.next.next = new Node(39);
        n.head.next.next.next.next.next.next.next = new Node(90);
        n.head.next.next.next.next.next.next.next.next = new Node(58);
        n.head.next.next.next.next.next.next.next.next.next = new Node(45);
        n.head.next.next.next.next.next.next.next.next.next.next = n.head.next.next.next;

        System.out.println(find.countNodesinLoop(n.head));

    }
}
