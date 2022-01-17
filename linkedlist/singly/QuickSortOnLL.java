package linkedlist.singly;

import predefined.Node;
import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/quick-sort-on-linked-list/1/?
public class QuickSortOnLL {

    // Quick sort using inbuild sorting methods
    Node quickSort(Node head){
        int arrSize = 0, i = 0, j = 0;
        Node temp = head, temp2 = head, result = head;

        while (temp != null){
            arrSize++;
            temp = temp.next;
        }

        int[] arr = new int[arrSize];

        for (int k = 0; k < arrSize; k++) {
            arr[k] = temp2.data;
            temp2 = temp2.next;
        }

        Arrays.sort(arr);

        while (result != null){
            result.data = arr[j];
            j++;
            result = result.next;
        }

        return head;
    }

    public static void main(String[] args) {
        QuickSortOnLL quick = new QuickSortOnLL();
        Node n = new Node();

        n.head = new Node(1);
        n.head.next = new Node(9);
        n.head.next.next = new Node(3);
        n.head.next.next.next = new Node(8);

        n.printList(quick.quickSort(n.head));
    }
}
