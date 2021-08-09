package linkedlist.singly;

public class SwapNodeWithoutChangeData {

    Node head;

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    void printList(Node node){
        while (node != null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }

    public void swapNodeWithoutChangingData(int x, int y){
        //check if x and y are same or not
        if (x == y) return;
        //search for x in linked list and keep track of precious node
        Node currentX = head, previousX = null;
        while (currentX != null && currentX.data != x){
            previousX = currentX;
            currentX = currentX.next;
        }//now we have x node in currentX and previous node of x in previousX

        //search for y in ll and keep track of previous node
        Node currentY = head, previousY = null;
        while (currentY != null && currentY.data != y){
            previousY = currentY;
            currentY = currentY.next;
        }//now we have y node in currentY and previous node of y in previousY

        //if both x and y nodes are null then return
        if (currentX == null || currentY != null) return;

        //if x is not head of linked list
        if (previousX != null)
            previousX.next = currentY;
        else
            head = currentY;

        //if y is not head of ll
        if (previousY != null)
            previousY.next = currentX;
        else
            head = currentX;

        //Now swap the nodes
        Node temp = currentX.next;
        currentX.next = currentY.next;
        currentY.next = temp;

    }

    public static void main(String[] args) {
        SwapNodeWithoutChangeData sd = new SwapNodeWithoutChangeData();

        sd.head = new Node(10);
        sd.head.next = new Node(20);
        sd.head.next.next = new Node(30);
        sd.head.next.next.next = new Node(40);
        sd.head.next.next.next.next = new Node(50);
        sd.head.next.next.next.next.next = new Node(60);
        sd.head.next.next.next.next.next.next = new Node(70);

        sd.printList(sd.head);
        sd.swapNodeWithoutChangingData(30, 60);
        sd.printList(sd.head);
    }

}
