package predefined;
// common implementation of node for all problems
public class Node {
    public Node head;
    public int data;
    public Node next;
    public Node(int d){
        data = d;
        next = null;
    }

    public Node(){}

    public void pushAtBeg(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printCircularList(){
        Node temp = head;
        do{
            System.out.print(temp.data+" ");
            temp = temp.next;
        }while (temp != head);
        System.out.println();
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }

    public void printList(Node head){
        while (head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
}
