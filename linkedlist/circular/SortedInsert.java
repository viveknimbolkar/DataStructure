package linkedlist.circular;

public class SortedInsert {
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public void printList(Node node) {
       Node temp = node;
        if (node != null) {
            do {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }while (temp != node);
        }
    }

    // Threee cases:
    // 1. compare previous node of head
    // 2. compare the small element just from node
    // 3. if list containing only single node
    Node sortedInsert(Node head, int data){
        Node tempNode = new Node(data);

        // if list having single node
        if (head == null){
            tempNode.next = tempNode;
            return tempNode;
        }

        // get the previous element just from head
        Node prev = head;
        while (prev.next != head){
            prev = prev.next;
        }

        if (head.data > data){
            tempNode.next = head;
            prev.next = tempNode;
            return tempNode;
        }

        // get the node which is just less than our data
        Node current = head;
        while (current.next.data < data){
            current = current.next;
        }

        //point next node to the tempNode and then point tempNode to the next node
        tempNode.next = current.next;
        current.next = tempNode;
        return  head;
    }

    public static void main(String[] args) {
        SortedInsert sortedInsert = new SortedInsert();
        int element = 2;
        sortedInsert.head = new Node(1);
        Node two = new Node(2);
        Node three = new Node(4);

        sortedInsert.head.next = two;
        two.next = three;
        three.next = sortedInsert.head;

        sortedInsert.sortedInsert(sortedInsert.head,4);
        sortedInsert.printList(sortedInsert.head);

    }
}
