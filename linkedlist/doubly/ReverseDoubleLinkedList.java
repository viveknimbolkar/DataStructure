package linkedlist.doubly;

public class ReverseDoubleLinkedList {

    Node head;

    static class Node{
        int data;
        Node prev, next;
        Node(int data){
            this.data = data;
            this.prev = this.next = null;
        }
    }

    public void reverseList(){
        Node temp = null; //store previous pointing address
        Node current = head;

        //now iterate throuth list and change the previous to next and next to previous
        //i.e. previous = next and next = previous
        while (current != null){
            temp = current.prev; //store previous pointer
            current.prev = current.next; //change previous to next
            current.next = temp; //change next pointer to previous
            current = current.prev; // iterate
        }

        //check for empty list and for single node too
        if (temp != null)
            head = temp.prev;
    }

    public void showList(Node node){

        while (node != null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }

    public void pushItem(int data){
        Node newNode = new Node(data);
        newNode.prev = null;
        newNode.next = head;
        //point head of list to new node
        if (head != null)
            head.prev = newNode;

        //set newnode as head
        head = newNode;
    }

    public static void main(String[] args) {
        ReverseDoubleLinkedList reverseDoubleLinkedList = new ReverseDoubleLinkedList();

        reverseDoubleLinkedList.pushItem(10);
        reverseDoubleLinkedList.pushItem(20);
        reverseDoubleLinkedList.pushItem(30);
        reverseDoubleLinkedList.pushItem(40);
        reverseDoubleLinkedList.pushItem(50);
        reverseDoubleLinkedList.pushItem(60);
        reverseDoubleLinkedList.pushItem(70);

        reverseDoubleLinkedList.showList(reverseDoubleLinkedList.head);
        reverseDoubleLinkedList.reverseList();
        reverseDoubleLinkedList.showList(reverseDoubleLinkedList.head);
    }

}
