package Linked_List;

public class SwapLL {

    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data =d;
            this.next = null;
        }
    }

    public void swapNode(int a, int b){

        //check if both node are having same data
        if (a == b)
            return;

        //search for a element in the list
        Node prevA = null, currA = head;

        while (currA != null && currA.data != a){
            prevA = currA;
            currA = currA.next;
        }

        //if a element if present, then search for B element in ll
        Node prevB = null, currB = head;

        while (currB != null && currB.data != b){
            prevB = currB;
            currB = currB.next;
        }

        /*
        now we have 4 nodes
        currA, currB
        prevA, prevB

        now if both nodes either currA or currB is not present then do nothing
        */

        if (currA == null || currB == null)
            return;

        //if A is not a head of our list
        if (prevA != null)
            prevA.next = currB;//point the prevA to the currB
        else
            head = currA;//set currA as head

        //if B is not a head of our list
        if (prevB != null)
            prevB.next = currA;//point the prevB to the currA
        else
            head = currB;//set currB as head

        //now swap the pointers of both node
        Node temp = currA.next;
        currA.next = currB.next;
        currB.next = temp;
    }

    public void push(int x){

        Node new_node = new Node(x);
        new_node.next = head;
        head = new_node;
    }

    public void printList(){
        Node temp = head;
        while (temp.next != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        SwapLL swapLL = new SwapLL();

        swapLL.push(10);
        swapLL.push(20);
        swapLL.push(30);
        swapLL.push(40);
        swapLL.push(50);
        swapLL.push(60);
        swapLL.push(70);

        swapLL.printList();
        System.out.println("--------");
        swapLL.swapNode(30,40);
        swapLL.printList();

    }
}
