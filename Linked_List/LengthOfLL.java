package Linked_List;

public class LengthOfLL {

    Node head;

    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    //find the length of the linked list using iterative method
    public int findLength(){
        Node temp = head;
        int length = 0;
        while (temp.next != null){
            temp = temp.next;
            length++;
        }
        return length;
    }

    //find the length of the linked list using recursive method
    public int lListCountRecursive(Node node){

        //check if the node is null return 0 that means link list is empty
        if (node == null)
            return 0;

        //start the recursion go one by one node
        return 1 + lListCountRecursive(node.next);
    }

    public int countNumber(){
        return lListCountRecursive(head);
    }

    //print the list
    public void printList(){
        Node temp = head;

        while (temp.next != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        LengthOfLL llength = new LengthOfLL();

        llength.head = new Node(10);
        Node two = new Node(20);
        Node three = new Node(30);
        Node four = new Node(40);
        Node five = new Node(50);
        Node six = new Node(60);

        //setting up the pointers
        llength.head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;

        llength.printList();
//        int len = llength.findLength();
//        System.out.println(len);
        System.out.println(llength.countNumber());

    }
}
