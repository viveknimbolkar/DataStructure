package linkedlist.singly;

import predefined.PredefinedMethods;

public class SwapElementPairwise {

    Node head;

    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public Node pairwiseSwap(Node head){
        Node temp = head;

        while(temp != null){
            int tempData = temp.data;
            temp.data = temp.next.data;
            temp.next.data = tempData;
            System.out.print(tempData);
            temp = temp.next.next;
        }
        head = temp;
        return head;
    }

    public void printList(Node node) {
        while (node != null){
            System.out.print(node.data+" ");
            node = node.next;
        }
    }


    public static void main(String[] args) {
        SwapElementPairwise swap = new SwapElementPairwise();
        PredefinedMethods methods = new PredefinedMethods();
        swap.head = new Node(1);
        swap.head.next = new Node(2);
        swap.head.next.next = new Node(2);
        swap.head.next.next.next = new Node(4);
        swap.head.next.next.next.next = new Node(5);
        swap.head.next .next.next.next.next= new Node(6);
        swap.head.next.next.next.next.next.next = new Node(7);
        swap.head.next.next.next.next.next.next.next = new Node(8);

        swap.printList(swap.head);
        System.out.println();
        swap.pairwiseSwap(swap.head);
        swap.printList(swap.head);
    }
}
