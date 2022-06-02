package linkedlist.singly;

import predefined.Node;

// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
public class BinaryToNumber {

    int getDecimalValue(Node head) {
        if (head == null)return -1;
        Node temp = head;
        // get the size of linked list
        int listSize = 0;
        while (temp != null){
            listSize++;
            temp = temp.next;
        }
        System.out.println("listsize: "+listSize);
        //add list items into array
        int i = 0;
        int[] tempArr = new int[listSize];
        while (head != null){
            tempArr[i] = head.data;
            head = head.next;
            i++;
        }
        for (int x:tempArr) {
            System.out.print(x+" ");
        }
        // create a number from binary
        int number = 0, k = listSize-1;
        for (int j = 0; j < listSize; j++) {
            number += Math.pow(2,k)*tempArr[j];
            k--;
        }

        return number;
    }

    public static void main(String[] args) {
        BinaryToNumber bin = new BinaryToNumber();
        Node node = new Node();
        node.head = new Node(1);
        node.head.next = new Node(0);
        node.head.next.next = new Node(1);
        System.out.println("\nans"+bin.getDecimalValue(node.head));
    }
}
