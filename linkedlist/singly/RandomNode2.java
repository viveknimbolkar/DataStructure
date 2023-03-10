package linkedlist.singly;
import predefined.Node;
import java.util.Random;

//https://leetcode.com/problems/linked-list-random-node
public class RandomNode2 {
    Random random;
    Node head;
    RandomNode2(Node head){
        this.head = head;
        random = new Random();
    }
    public int getRandom(){
        int count = 0;
        int result = 0;
        Node curr = head;
        while (curr != null){
            count++;
            if (random.nextInt(count) == 0) result = curr.data;
            curr = curr.next;
        }
        return result;
    }
    public static void main(String[] args) {
            Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        RandomNode2 rnode = new RandomNode2(head);

            System.out.println(rnode.getRandom());
    }
}
