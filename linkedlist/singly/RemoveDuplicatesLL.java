package linkedlist.singly;

public class RemoveDuplicatesLL{

    Node head;
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void removeDuplicates(){
        Node selected_node = null, to_compare_node = null, duplicate = null;
        selected_node = head;

        //iterate upto the end of the list and pick a single element to compare it to each and every node in linked list
        while (selected_node != null && selected_node.next != null){
            to_compare_node = selected_node;

            //iterate from start to end through the rest of the linked list to compare each node to
            // selected_node
            while (to_compare_node.next != null){
                //if any matching node is found then unlink that specific node
                if (selected_node.data == to_compare_node.next.data){
                    duplicate = to_compare_node.next; //put next matching jode to the duplicate node
                    to_compare_node.next = to_compare_node.next.next;  //point the duplicate dat to the next node
                    System.gc();
                }else {
                    //jump to the next node to compare it
                    to_compare_node = to_compare_node.next;
                }
            }
            //jump to the next node
            selected_node = selected_node.next;
        }
    }

    public void printList(Node node){
        while (node != null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {

        RemoveDuplicatesLL rdll = new RemoveDuplicatesLL();

        rdll.head = new Node(10);
        rdll.head.next = new Node(20);
        rdll.head.next.next = new Node(30);
        rdll.head.next.next.next = new Node(30);
        rdll.head.next.next.next.next = new Node(40);
        rdll.head.next.next.next.next.next = new Node(50);
        rdll.head.next.next.next.next.next.next = new Node(50);
        rdll.head.next.next.next.next.next.next.next = new Node(60);

        rdll.printList(rdll.head);
        rdll.removeDuplicates();
        rdll.printList(rdll.head);
    }
}