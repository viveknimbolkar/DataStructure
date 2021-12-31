package linkedlist.singly;

import predefined.Node;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class UnionOfTwoLL {

    LinkedList<Integer> findUnion(Node head1, Node head2){
        HashSet<Integer> set = new HashSet<>();
        LinkedList<Integer> list = new LinkedList<>();

        Node temp = head1, temp2 = head2;

        while (temp != null){
            set.add(temp.data);
            temp = temp.next;
        }

        while ( temp2 != null){
            set.add(temp2.data);
            temp2 = temp2.next;
        }

        Iterator<Integer> itr = set.iterator();

        while (itr.hasNext()){
            list.add(itr.next());
        }

        return list;
    }

    public static void main(String[] args) {
        UnionOfTwoLL union = new UnionOfTwoLL();
        Node node = new Node();
        Node node2 = new Node();

        node.head = new Node(9);
        node.head.next = new Node(6);
        node.head.next.next = new Node(4);
        node.head.next.next.next = new Node(2);
        node.head.next.next.next.next = new Node(3);
        node.head.next.next.next.next.next = new Node(8);


        node2.head = new Node(1);
        node2.head.next = new Node(2);
        node2.head.next.next = new Node(8);
        node2.head.next.next.next = new Node(6);
        node2.head.next.next.next.next = new Node(2);

        System.out.println("Union: "+union.findUnion(node.head, node2.head));
    }
}
