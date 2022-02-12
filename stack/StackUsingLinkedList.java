/*
STACK VISUAL REPRESENTATION

| head  (head always on the top)    |
| head.next                         |
| head.next.next                    |
| head.next.next.next               |
| head.next.next.next.next          |
|___________________________________|
 */
package stack;

public class StackUsingLinkedList {

    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
        }
    }


    //check if ll is empty
     boolean isEmpty(){
        if (head == null){
            System.out.println("Stack is empty!");
            return true;
        }
        else{
            System.out.println("Stack is not empty!");
            return false;
        }
    }


    //add item into the ll stack
     void pushItem(int item){
        Node newNode = new Node(item);
        //assign newnode to the head if head is empty
        if (head == null)
            head = newNode;
        else {
            Node temp = head;
            head = newNode;
            newNode.next = temp;
        }
        System.out.println(item+" is added into the stack.");
    }

    //remove item from stack ll
     void removeItem(){

        int poppedItem = Integer.MIN_VALUE;
        if (head == null)
            System.out.println("Stack is empty! Item can't be removed.");
        else {
        poppedItem = head.data; //set the item of head to the popped item
        head = head.next; //change the head to the next stack item
        }
    }

    //print the stack items
     void printStack(){
        Node temp = head;
        while (temp.next != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedList sll = new StackUsingLinkedList();

        sll.pushItem(10);
        sll.pushItem(20);
        sll.pushItem(30);
        sll.pushItem(40);
        sll.pushItem(50);
        sll.removeItem();
        sll.printStack();
    }
}
