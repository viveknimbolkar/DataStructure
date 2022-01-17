package linkedlist.singly;

import predefined.Node;

public class MergeSortOnLL {

    //use to merge two sorted linked list
    Node mergeTwoSortedLL(Node list1, Node list2){
        Node resultNode = null;
        // if any of the list is empty then return the opposite list
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // if l1 node is smaller than l2 then append it to the resultNode
        if (list1.data < list2.data){
            resultNode = list1;
            resultNode.next = mergeTwoSortedLL(list1.next, list2);
        }else{
            resultNode = list2;
            resultNode.next = mergeTwoSortedLL(list1, list2.next);
        }
        return resultNode;
    }

    //Use to find the mid of linkedlist
    Node findMidOfLL(Node head){
        if (head == null) return head;
        Node slow = head, fast = head;

        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
//        System.out.println("Mid is: "+slow.data);
        return slow;
    }

    //merge sort algorithm
    Node mergeSortOnLL(Node head){
        if (head == null || head.next == null)
            return head;

        Node midNode = findMidOfLL(head);
        Node nextOfMiddle = midNode.next;
        midNode.next = null;
        Node firstHalfList = mergeSortOnLL(head); // passing the head node (starting) of first half list
        Node secondHalfList = mergeSortOnLL(nextOfMiddle); // passing the head node (starting) of second half list
        return mergeTwoSortedLL(firstHalfList, secondHalfList);
    }

    public static void main(String[] args) {
        Node node = new Node();
        MergeSortOnLL mergeSort = new MergeSortOnLL();

        node.head = new Node(3);
        node.head.next = new Node(5);
        node.head.next.next = new Node(2);
        node.head.next.next.next = new Node(4);
        node.head.next.next.next.next = new Node(1);

        node.printList(node.head);
        node.printList(mergeSort.mergeSortOnLL(node.head));
    }
}
