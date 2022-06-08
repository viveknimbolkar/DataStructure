package linkedlist.singly;
// https://leetcode.com/problems/merge-in-between-linked-lists/
import predefined.Node;
public class MergeBetweeList {

    Node mergeInBetween(Node list1, int a, int b, Node list2) {
        Node curr = list1;
        Node start = null, end = null;
        int count = 1;

        while (curr != null){
            // get starting node
            if (count == a){
                start = curr;
            }
            // get last node
            if (count == b){
                end = curr.next.next;
            }
            count++;
            curr = curr.next;
        }
        // point the next of start to list2
        start.next = list2;
        curr = list2;
        while (curr.next != null){
            curr = curr.next;
        }
        // point the last of list2 to end node of list1
        curr.next = end;
        return list1;
    }

    public static void main(String[] args) {
        MergeBetweeList me  = new MergeBetweeList();
        Node l1 = new Node();
        Node l2 = new Node();

        l1.head = new Node(0);
        l1.head.next = new Node(1);
        l1.head.next.next = new Node(2);
        l1.head.next.next.next= new Node(3);
        l1.head.next.next.next.next = new Node(4);
        l1.head.next.next.next.next.next = new Node(5);

        l2.head = new Node(1000000);
        l2.head.next = new Node(1000001);
        l2.head .next.next= new Node(1000002);

        l1.printList(me.mergeInBetween(l1.head,3, 4,l2.head));
    }
}
