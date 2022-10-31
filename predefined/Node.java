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

    public int getListSize(Node node){
        int size = 0;
        Node temp = node;
        while (temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }

    public Node getMidNode(Node node){
        Node slow = node, fast = node;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void pushAtEnd(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;

        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;

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
        if (temp == null){
            System.out.println("List is empty!");
            return;
        }
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
