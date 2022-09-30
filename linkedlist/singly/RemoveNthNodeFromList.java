package linkedlist.singly;

import predefined.Node;

public class RemoveNthNodeFromList {

    Node removeNthFromEnd(Node head, int n) {
        Node temp = head, prev = null, p1 = head, p2 = head;

        for(int i = 0; i < n; i++){
            p1 = p1.next;
        }

        while(p1 != null){
            prev = p2;
            p1 = p1.next;
            p2 = p2.next;
        }

        if(head == p2){
            return head.next;
        }else{
            prev.next = p2.next;
        }

        return head;
    }

    public static void main(String[] args) {
        RemoveNthNodeFromList rmlist = new RemoveNthNodeFromList();

        Node node = new Node();
        node.head = new Node(1);
        node.head.next = new Node(2);
        node.head.next.next = new Node(3);
        node.head.next.next.next = new Node(4);
        node.head.next.next.next.next = new Node(5);

        rmlist.removeNthFromEnd(node.head,2);

        node.printList(node.head);
        
    }

}
