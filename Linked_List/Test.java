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

    public void addAtStart(int new_data){

        Node new_node = new Node(new_data);

        new_node.next = head.next;

        head = new_node;
    }

    public void addAtGivenNode(Node previous_node, int new_data){

    }

    public static void main(String[] args) {
        Test list = new Test();

        list.head = new Node(10);
        Node two = new Node(20);
        Node three = new Node(30);
        Node four = new Node(40);

        list.head.next = two;
        two.next = three;
        three.next = four;

        list.addAtStart(67);
        list.printArray();
        list.addAtStart(56);
        list.printArray();

    }
}
