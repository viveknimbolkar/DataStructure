package Linked_List.Doubly_Linked_List;

public class DeleteDoublyLL {

    Node head;

    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
        }
    }

    //add an element at the front of dll
    public void addAtFront(int data){

        Node new_node = new Node(data);
        new_node.next = head;
        new_node.prev = null;
        if (head != null)
            head.prev = new_node;

        head  = new_node;
    }

    //delete a given node in dll
    public void deleteNode(Node del){

        //if both head or del node are null
        if(head == null || del == null)
            return;

        //if head is equal to delete then make next of head as del's next
        if (head == del)
            head = del.next;

        //if delete node's next is not the last node
        if (del.next != null)
            del.next.prev = del.prev;

        //if delete node's previous is not null
        if (del.prev != null)
            del.prev.next = del.next;

        return;
    }

    //delete a node at a given point
    public void deleteAtGivenPosition(int position){

        //if the list is empty or position is negative then do nothing
        if (head == null || position <=0)
            return;

        Node current_node = head;

        //traverse and find the current node in the list
        for (int i = 0; i < position && current_node != null; i++)
            current_node = current_node.next;

        //now we have a given node in current_node node so call the method and delete it
        deleteNode(current_node);

    }

    //print the ddll
    public void printDLL(){
        Node temp = head;
        while (temp.next != null){
            System.out.printf(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        DeleteDoublyLL ddll = new DeleteDoublyLL();

        ddll.addAtFront(30);
        ddll.addAtFront(40);
        ddll.addAtFront(50);
        ddll.addAtFront(60);
        ddll.addAtFront(70);

        ddll.printDLL();
        ddll.deleteAtGivenPosition(0);
        ddll.printDLL();
    }
}
