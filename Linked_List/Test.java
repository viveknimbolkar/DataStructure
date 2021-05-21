package Linked_List;

public class Test {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public void printArray(){

        Node n = head;

        while (n.next != null){
            System.out.println(n.data);
            n = n.next;
        }
    }

    public void delete(int key){

        Node temp=head, prev=null;

        if (temp != null && key == temp.data){
            head = temp.next;
            return;
        }
        prev.next = temp.next;
    }

    public static void main(String[] args) {
        Test list = new Test();

        list.head = new Node(10);
        Node two = new Node(20);

        list.head.next = two;




        list.printArray();
        list.delete(10);


    }
}
