package linkedlist.singly;
import predefined.Node;
//https://leetcode.com/problems/linked-list-cycle-ii/
public class LinkedListCycle2 {

    Node detectCycle(Node head) {
        if(head == null || head.next == null) return null;
        Node slow = head, fast = head, entry = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;

            // get node before the collion point
            if(slow == fast){
                // if node found then iterate one by one upto collision point
                while(slow != entry){
                    slow = slow.next;
                    entry = entry.next;
                }
                return entry;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        LinkedListCycle2 ll = new LinkedListCycle2();
        Node node = new Node();
        node.head = new Node(3);
        node.head.next = new Node(2);
        node.head.next.next = new Node(0);
        node.head.next.next.next = new Node(-4);
        node.head.next.next.next.next = node.head.next;

        System.out.println(ll.detectCycle(node.head).data);
    }
}

