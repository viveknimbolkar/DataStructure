package linkedlist.singly;
// https://practice.geeksforgeeks.org/problems/delete-alternate-nodes/1/
public class DeleteAlternateNodes {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    Node deleteAlternateNode(Node head){
        Node temp = head;
        while (temp != null && temp.next != null){
            temp.next = temp.next.next;
            temp = temp.next;
        }
        return head;
    }

    void printList(Node head){
        while (head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DeleteAlternateNodes delete = new DeleteAlternateNodes();
        delete.head = new Node(1);
        delete.head.next = new Node(2);
        delete.head.next.next = new Node(3);
        delete.head.next.next.next = new Node(4);
        delete.head.next.next.next.next = new Node(5);
        delete.head.next.next.next.next.next = new Node(6);

        delete.printList(delete.head);
        delete.deleteAlternateNode(delete.head);
        delete.printList(delete.head);
    }
}
