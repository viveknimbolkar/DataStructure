package linkedlist.singly;



public class RecursiveLengthOfLL {

    Node head;

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
       RecursiveLengthOfLL rll = new RecursiveLengthOfLL();
       rll.head = new Node(10);
       Node two = new Node(20);
       Node three = new Node(30);
       Node four = new Node(40);
       Node five = new Node(50);
       Node six = new Node(60);
       Node seven = new Node(70);

       rll.head.next = two;
       two.next = three;
       three.next = four;
       four.next = five;
       five.next =six;
       six.next = seven;

        System.out.println(rll.findLength(rll.head));

    }

    //recursive method to find linked list length
    public int findLength(Node head){
        if (head == null)
            return 0;
        return 1 + findLength(head.next);
    }

    public void printList(){
        Node temp = head;
        while (temp.next != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
