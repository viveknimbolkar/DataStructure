package predefined;

public class DoubleNode {

    public DoubleNode head;
    public int data;
    public DoubleNode next, prev;
    public DoubleNode(int d){
        data = d;
        next = prev = null;
    }

    public DoubleNode(){}

    public void printDoublyLL(DoubleNode node){
        DoubleNode temp = node;

        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
