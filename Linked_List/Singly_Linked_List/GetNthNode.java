package Linked_List.Singly_Linked_List;

public class GetNthNode {
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

    //get the nth node of the linked list
    public int getNode(int place){

        Node temp = head;

        //check if the list is empty or not
        if (temp == null)
            return 0;

        //store the node data into this variable
        int node_data = 0;

        //loop through the linked list upto the given position
        for (int i = 0; i <= place; i++){

            //at the last of the iteration
            if (i == place){
                //store the data of the node to the variable to return it.
                node_data = temp.data;
            }
            temp = temp.next; //increment node

        }
        return node_data; //return the node data
    }

    public static void main(String[] args) {

        GetNthNode getnode = new GetNthNode();

        getnode.head = new Node(10);
        Node two = new Node(20);
        Node three = new Node(30);
        Node four = new Node(40);
        Node five = new Node(50);
        Node six = new Node(60);

        //setting up the pointers
        getnode.head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;

        int position = 3;
        getnode.printList();
        System.out.println("Data of "+position+" node is "+getnode.getNode(position-1));
    }
}
