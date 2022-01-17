package linkedlist.singly;
// TODO: Incomplete
import predefined.Node;


// https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1/
public class RemoveDuplicates {

    void removeDuplicates(Node node){
        Node current = node;

        while (current != null && current.next != null){
            // compare the next node data and current data
            if (current.next.data == current.data){
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        }
        return;
    }

    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        Node node = new Node();

        node.head = new Node(6);
        node.head.next = new Node(3);
        node.head.next.next = new Node(6);
        node.head.next.next.next = new Node(3);
        node.head.next.next.next.next = new Node(1);

        removeDuplicates.removeDuplicates(node.head);
        node.printList();
    }
}
