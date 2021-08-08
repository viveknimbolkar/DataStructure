package linkedlist.singly;

public class MoveLastElementToFirst {

    Node head;

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void printList(Node node) {
        //if last next value is null then get out of the loop
        while (node != null){
            System.out.print(node.data+" "); //iterate through the list and traverse it
            node = node.next; //go to the next node address
        }
        System.out.println();
    }

    public void moveLastElementToFirst(){
        //keep track of recent node and current node to find out the last node and second last node in list
        Node second_last_node = null, last_node = head;
        //traverse upto the end of the linked list
        while (last_node.next != null){
            second_last_node = last_node;
            last_node = last_node.next;
        }
        //now we have last node in last_node node and second_last_node.
        //make the next of last_node as head and the next of second_last_node as null

        last_node.next = head; //point last node to the head
        second_last_node.next = null; //make last node null (that means end of the list)
        head = last_node; //last_node as head
    }

    public static void main(String[] args) {
        MoveLastElementToFirst mletf = new MoveLastElementToFirst();

        mletf.head = new Node(10);
        mletf.head.next = new Node(20);
        mletf.head.next.next = new Node(30);
        mletf.head.next.next.next = new Node(40);
        mletf.head.next.next.next.next = new Node(50);
        mletf.head.next.next.next.next.next = new Node(60);
        mletf.head.next.next.next.next.next.next = new Node(70);

        mletf.printList(mletf.head);
        mletf.moveLastElementToFirst();
        mletf.printList(mletf.head);

    }
}
