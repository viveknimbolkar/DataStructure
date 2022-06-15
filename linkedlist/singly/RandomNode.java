package linkedlist.singly;
import predefined.Node;
// https://leetcode.com/problems/linked-list-random-node/
public class RandomNode {
    int[] elements;
    Node head;
    int count;
    RandomNode(Node head) {
        Node temp = head;
        // get the size of the list
        count = 0 ;
        int i = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        elements = new int[count];
        // add list elements into array
        temp = head;
        while (temp != null){
            elements[i++] = temp.data;
            temp = temp.next;
        }
        // print elements
        for (int x:elements) {
            System.out.print(x+" ");
        }
    }

    RandomNode(){}

    public int getRandom() {
        int min =1, max;
        if (head == null) min = 0;
        max = count;
        int randomNum = (int) (Math.random()*(max-min)+min);
        return elements[randomNum];
    }

    public static void main(String[] args) {
        Node n = new Node();
        n.head = new Node(1);
        n.head.next = new Node(2);
        n.head.next.next = new Node(3);

        RandomNode randomNode = new RandomNode(n.head);
        System.out.println(randomNode.getRandom());
    }
}
