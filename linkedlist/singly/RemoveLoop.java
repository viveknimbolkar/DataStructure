package linkedlist.singly;

import predefined.Node;

import java.util.HashSet;
// https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1/
public class RemoveLoop {


    // get the starting node of loop
    void removeLoop(Node node){
        HashSet<Node> set = new HashSet<>();
        Node prev = null;
        while (node != null){
            if (set.contains(node)){
                prev.next = null; // if found then unlink node
                return;
            }
            set.add(node);
            prev = node; // make current node as a previous
            node = node.next;
        }
    }

    public static void main(String[] args) {
        RemoveLoop remove = new RemoveLoop();
        Node n = new Node();

        n.head = new Node(1);
        n.head.next = new Node(3);
        n.head.next.next = new Node(4);
        n.head.next.next.next = n.head.next;

        remove.removeLoop(n.head);
        n.printList(n.head);
    }
}
