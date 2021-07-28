package linkedlist.singly;

public class FindMiddleElement {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    //print the list
    public void printList(){

        Node temp = head;

        while (temp.next != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    /*find the middle part of the element. Here we use iterative method. We use to pointer
    *slow_pointer and fast pointer
    *slow pointer will increment by 1 node
    * fast_pointer will increment by 2 node in each iteration
    * using this approch we can findout the middle node of the linked list as slow_pointer will at center
    */
    public void findMiddleElement(){

        Node slow_pointer = head;
        Node fast_pointer = head;

        if (head != null) {

            while (fast_pointer != null && fast_pointer.next != null) {
                fast_pointer = fast_pointer.next.next;
                slow_pointer = slow_pointer.next;
            }

            System.out.println("The middle element is: " + fast_pointer.data);
        }
    }


    public static void main(String[] args) {

        FindMiddleElement find_mid = new FindMiddleElement();

        find_mid.head = new Node(10);
        Node two = new Node(20);
        Node three = new Node(30);
        Node four = new Node(40);
        Node five = new Node(50);
        Node six = new Node(60);

        //setting up the pointers
        find_mid.head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;

        find_mid.printList();
        find_mid.findMiddleElement();
       
    }
}
