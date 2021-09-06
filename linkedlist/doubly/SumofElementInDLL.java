package linkedlist.doubly;

public class SumofElementInDLL {
    Node head;
    static class Node{
        int data;
        Node next,prev;
        Node(int data){
            this.data = data;
        }
    }

    public void addNode(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
        if (head != null)
            head.prev = newNode;
        head = newNode;
    }

    public void printList(){
        Node temp = head;
        while (temp.next != null){
            System.out.printf(temp.data+" "); //Always user printf() function and use double quotation
            temp = temp.next;
        }
        System.out.println();
    }

    public void getSumOfElement(){
        Node temp = head;
        int pointer = 0;
        while (temp != null){
            pointer = pointer + temp.data;
            temp = temp.next;
        }
        System.out.println(pointer);
    }

    public static void main(String[] args) {
        SumofElementInDLL sumofElementInDLL = new SumofElementInDLL();

        sumofElementInDLL.addNode(10);
        sumofElementInDLL.addNode(20);
        sumofElementInDLL.addNode(30);
        sumofElementInDLL.addNode(40);
        sumofElementInDLL.addNode(50);
        sumofElementInDLL.addNode(60);

        sumofElementInDLL.printList();
        sumofElementInDLL.getSumOfElement();

    }
}
