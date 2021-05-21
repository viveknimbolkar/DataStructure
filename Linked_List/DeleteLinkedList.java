package Linked_List;

public class DeleteLinkedList {
    Node head;

    static class Node{

        int data;
        Node next;

        Node(int d){

            this.data = d;
            this.next = null;
        }
    }

   public void printList(){

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
   }

    //delete a node at given position
    public void deleteByPosition(int position){

        //first check for the link is empty or not
        if (head == null){
            return;
        }

        Node temp = head;//create a temperary node

        //if the head position is to be deleted then
        if (position == 0){
            head = temp.next;
            return;
        }

        //if position is not zero then loop through the list to get a previous node and its position
        for (int i = 0; temp != null && i < position-1; i++)
            temp = temp.next;

        //if the node is empty, that we are going to delete. return it and don't do anything
        //Because it is already empty so don't need to delete
        if (temp == null || temp.next == null)
            return;

        Node temp2 = temp.next.next;
        temp.next = temp2;

    }

    public static void main(String[] args) {

        DeleteLinkedList del = new DeleteLinkedList();

        //creating a linked list by creating nodes
        del.head = new Node(10);
        Node two = new Node(20);
        Node three = new Node(30);
        Node four = new Node(40);
        Node five = new Node(50);
        Node six = new Node(60);
        Node seven = new Node(70);

        //setting up the pointer of the nodes
        del.head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;

        del.printList();
        del.deleteByPosition(2);
        del.printList();

    }
}
