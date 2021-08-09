package linkedlist.singly;

public class MergeTwoSortedList {

    Node firstList, secondList;
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

    //merge two sorted linked list
    public Node mergeTwoSortedList(Node nodeA, Node nodeB){

        Node dummyNode = new Node(0); //create a dummy node
        Node tailOfList = dummyNode; //last node of dummyNode linked list

        while (true){
            //if nodeA has no further elements
            if (nodeA == null){
                tailOfList.next = nodeB; //merge nodeB as it is to the tailOfList linked list
                break;
            }
            //if nodeB has no further elements
            if (nodeB == null){
                tailOfList.next = nodeA; //merge nodeA as it is to the tailOfList linked list
                break;
            }

            //now compare each & every node of both list
            //add all the nodes step by step who's element is less than another node into tailOfList linked list
            if (nodeA.data <= nodeB.data){
                tailOfList.next = nodeA;
                nodeA = nodeA.next;
            }else {
                tailOfList.next = nodeB;
                nodeB = nodeB.next;
            }
            //increment tailOfList linked list
            tailOfList = tailOfList.next;
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        MergeTwoSortedList mtsl = new MergeTwoSortedList();
        //first linked list
        mtsl.firstList = new Node(5);
        mtsl.firstList.next = new Node(10);
        mtsl.firstList.next.next = new Node(35);
        mtsl.firstList.next.next.next = new Node(51);
        mtsl.firstList.next.next.next.next = new Node(70);

        //second linked list
        mtsl.secondList = new Node(34);
        mtsl.secondList.next = new Node(38);
        mtsl.secondList.next.next = new Node(40);
        mtsl.secondList.next.next.next= new Node(56);
        mtsl.secondList.next.next.next.next = new Node(85);
        mtsl.secondList.next.next.next.next.next = new Node(99);

        mtsl.printList(mtsl.firstList);
        mtsl.printList(mtsl.secondList);

        mtsl.firstList = mtsl.mergeTwoSortedList(mtsl.firstList, mtsl.secondList);

        System.out.println("Merged list:");
        mtsl.printList(mtsl.firstList);
    }
}
