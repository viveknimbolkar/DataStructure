package linkedlist.singly;

import predefined.Node;
// https://practice.geeksforgeeks.org/problems/find-nk-th-node-in-linked-list/1/
public class FindNode {

    int nkNode(Node node, int k){
       if(k <=0 || node == null)
           return -1;

       Node fractionalNode = null;
       int i = 0;
       for(Node temp = node; temp != null; temp = temp.next){
//           System.out.println("modulus: "+i%k);
           // The pattern of 0s and 1s
           if (i % k == 0){
               if(fractionalNode == null){
                   fractionalNode = node;
               }else {
                   fractionalNode = fractionalNode.next;
               }
           }
           i++;
       }
       return fractionalNode.data;
    }

    public static void main(String[] args) {
        Node node = new Node();
        FindNode find = new FindNode();

        node.head = new Node(1);
        node.head.next = new Node(2);
        node.head.next.next = new Node(3);
        node.head.next.next.next = new Node(4);
        node.head.next.next.next.next = new Node(5);
        node.printList(node.head);
        System.out.println(find.nkNode(node.head, 2));

    }
}
