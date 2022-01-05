package linkedlist.singly;
// TODO: Incomplete solution
import predefined.Node;


public class Sort0s1s2s {

    Node segregate(Node node){
        Node temp = node;

        while (temp != null){

            temp = temp.next;
        }
        return node;
    }

    //count the frequency of 0, 1 and 2
    int[] getFrequency(Node node){
        Node temp = node;
        int zero = 0, one = 0, two = 0;

        while (temp != null){
            if (temp.data == 0)
                zero++;
            else if (temp.data == 1)
                one++;
            else if(temp.data == 2)
                two++;
            temp = temp.next;
        }

        int[] arr = new int[zero+one+two];
        arr[0] = zero;
        arr[1] = two;
        arr[2] = two;
        return arr;
    }

    public static void main(String[] args) {
        Sort0s1s2s sort = new Sort0s1s2s();
        Node node = new Node();

        node.head = new Node(1);
        node.head.next = new Node(2);
        node.head.next.next = new Node(2);
        node.head.next.next.next = new Node(1);
        node.head.next.next.next.next = new Node(2);
        node.head.next.next.next.next.next = new Node(0);
        node.head.next.next.next.next.next.next = new Node(2);
        node.head.next.next.next.next.next.next.next = new Node(2);
        node.head.next.next.next.next.next.next.next.next = new Node(0);

        node.printList(node.head);
    }
}
