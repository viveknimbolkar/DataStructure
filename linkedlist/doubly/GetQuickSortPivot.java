package linkedlist.doubly;
// https://practice.geeksforgeeks.org/problems/quicksort-on-doubly-linked-list/1/
import predefined.DoubleNode;
public class GetQuickSortPivot {

    DoubleNode partation(DoubleNode l, DoubleNode h){
        // take a pivot element
        int pivot = h.data;
        DoubleNode i = l.prev;

        for (DoubleNode j = l; j != h; j = j.next) {
            if (j.data <= pivot){
                i =  (i == null)? l: i.next;
                // swap if j < pivot
                int temp = i.data;
                i.data = j.data;
                j.data = temp;
            }
        }
        // swap when pivot element is at it's sorted position
        i = (i == null)? l: i.next;
        int temp = i.data;
        i.data = h.data;
        h.data = temp;
        return i;
    }

    public static void main(String[] args) {
        GetQuickSortPivot sort = new GetQuickSortPivot();
        DoubleNode dn = new DoubleNode();

        dn.head = new DoubleNode(1);
        dn.prev = null;

        dn.head.next = new DoubleNode(4);
        dn.head.prev = dn.head;

        dn.head.next.next = new DoubleNode(9);
        dn.head.next.prev = dn.head.next;

        dn.head.next.next.next = new DoubleNode(2);
        dn.head.next.next.prev = dn.head.next.next;

        dn.printDoublyLL(dn.head);
    }
}
