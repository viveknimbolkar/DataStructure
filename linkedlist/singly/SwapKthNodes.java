package linkedlist.singly;

import predefined.Node;

// https://practice.geeksforgeeks.org/problems/swap-kth-node-from-beginning-and-kth-node-from-end-in-a-singly-linked-list/1/
public class SwapKthNodes {

    Node swapkthnode(Node head, int num, int K){

//        int startingNode = K, endingNode = num-K+1;
//        System.out.println("startingNode"+startingNode+" endNode"+endingNode);
        Node begKNode = head, begKNodePrev = null, endKNode = head, endKNodePrev = null;

        //get beg and prev of beg node
        for (int i = 1; i < K; i++) {
            begKNodePrev = begKNode;
            begKNode = begKNode.next;
        }

        //get end and prev of end node
        for (int i = 1; i < num-K+1; i++) {
            endKNodePrev = endKNode;
            endKNode = endKNode.next;
        }

//        System.out.println("begk: "+begKNode.data+" begKPrev: "+begKNodePrev.data);
//        System.out.println("endk: "+endKNode.data+" endKPrev: "+endKNodePrev.data);

        if (begKNodePrev != null)
            begKNodePrev.next = endKNode;
        if (endKNodePrev != null)
            endKNodePrev.next = begKNode;

        Node temp = begKNode.next;
        begKNode.next = endKNode.next;
        endKNode.next = temp;

        return head;
    }

    public static void main(String[] args) {
        Node n = new Node();
        SwapKthNodes swap = new SwapKthNodes();

        n.head = new Node(1);
        n.head.next = new Node(2);
        n.head.next.next = new Node(3);
        n.head.next.next.next = new Node(4);

        n.printList(swap.swapkthnode(n.head, 4, 1));
    }
}
