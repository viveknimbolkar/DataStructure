package Linked_List.Singly_Linked_List;

public class SearchingLinkedList {

    Node head;

    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    //find element using iterative method
    public int search(int value){
        Node temp = head;
        int count = 0;
        while (temp.next != null){
            count++;
            //if the value match
            if (temp.data == value)
                break;
            temp = temp.next;
        }
        return count;
    }

    //find element using recursive method
    public boolean searchRecursive(Node temp, int value){

        //check if link list is empty or not
        if (temp == null)
            return false;
        //check for the data is matching or not
        if (temp.data == value)
            return true;

        //go next node and check for above conditions
        return searchRecursive(temp.next,value);
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

        SearchingLinkedList lfind = new SearchingLinkedList();

        lfind.head = new Node(10);
        Node two = new Node(20);
        Node three = new Node(30);
        Node four = new Node(40);
        Node five = new Node(50);
        Node six = new Node(60);

        //setting up the pointers
        lfind.head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;

        lfind.printList();
        boolean isFound = lfind.searchRecursive(lfind.head, 3);
        if (isFound)
            System.out.println("found");
        else
            System.out.println("Not found");
    }
}
