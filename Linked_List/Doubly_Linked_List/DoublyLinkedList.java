//implementation of doublylinkedlist
package Linked_List.Doubly_Linked_List;

public class DoublyLinkedList {

//implementation of dll
    Node head;

    static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){ this.data = data; } //constructor
    }
//=====================================================================================
    //add a node at the front of the list
    public void addAtFront(Node prev, int data){

        //creating a new node
        Node new_node = new Node(data);

        //head is the next of new node and we don't know previous node so it null
        new_node.next = head;
        new_node.prev = null;

        //make previous of head new_node
        if (head != null)
            head.prev = new_node;

        head = new_node;//set new_node as a head
    }
//=================================================================
    //add the element at random position to the doubaly linked list
    public void addAtGivenPosition(Node prev,int data){

        if (prev.next == null)
            return;

        //create a new node
        Node new_node = new Node(data);
        new_node.next = prev.next;
        new_node.prev = prev;

        //set the previous of new_node's next new node
        if (new_node.next != null)
            new_node.next.prev = new_node;
    }
//=================================================================

    //print doubaly linked list
    public void printDList(){
        Node temp = head;

        while (temp.next != null){
            System.out.printf(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addAtFront(null, 45);
        dll.addAtFront(null, 34);
        dll.addAtFront(null, 35);
        dll.addAtFront(null, 4567);
        dll.addAtFront(null, 234);
        dll.addAtFront(null, 657);
        dll.addAtFront(null, 34);
        dll.printDList();
        dll.addAtGivenPosition(dll.head.next, 77);
        dll.printDList();
    }
}
