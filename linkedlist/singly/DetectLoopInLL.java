package linkedlist.singly;

/*
10 -> 20 ->30 ->40 ->50
           |^     |
          60  <- 50
 */
import java.util.HashSet;

public class DetectLoopInLL {

    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //find the loop using hashset DS
    static boolean findLoopInLinkedList(Node node){
        //Store each node in hashset ds
        HashSet<Node> nodelist = new HashSet<>();

        while (node != null){
            //check if the current node is already present in nodelist or not
            if (nodelist.contains(node))
                return true;
            //add each and every new node to the hashset
            nodelist.add(node);
            node = node.next;
        }

        return false;
    }

    public static void main(String[] args) {
        DetectLoopInLL dlill = new DetectLoopInLL();

        dlill.head = new Node(10);
        Node two = new Node(20);
        Node three = new Node(30);
        Node four = new Node(40);
        Node five = new Node(50);
        Node six = new Node(60);

        dlill.head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = three;

        System.out.println(findLoopInLinkedList(dlill.head));

    }
}
