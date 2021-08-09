package linkedlist.singly;

public class ReverseLL {

    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    void printList(){
        Node node = head;
        while (node != null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }

    //reverse the whole linked list
    Node reverseList(Node node){
        //keep track of previous, current and next node
        Node current_node = head, previous_node = null, next_node = null;
        //iterate through the loop
        while (current_node != null){
            next_node = current_node.next; //store the next node
            current_node.next = previous_node;//point current node to the previous node to reversed it
            //now jump to next node along with previous and current node
            previous_node = current_node;
            current_node = next_node;
        }
        //return previous node as a reversed linked list
        node = previous_node;
        return previous_node;

    }

    public static void main(String[] args) {
        ReverseLL rll = new ReverseLL();

        rll.head = new Node(10);
        rll.head.next = new Node(20);
        rll.head.next.next = new Node(30);
        rll.head.next.next.next= new Node(40);
        rll.head.next.next.next.next = new Node(50);
        rll.head.next.next.next.next.next = new Node(60);

        rll.printList();
        rll.head = rll.reverseList(rll.head);
        rll.printList();

    }
}
