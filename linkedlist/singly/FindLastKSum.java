package linkedlist.singly;

import predefined.Node;
// https://practice.geeksforgeeks.org/problems/find-the-sum-of-last-n-nodes-of-the-linked-list/1/
import java.util.ArrayList;

public class FindLastKSum {


    int sum(Node head, int k){
        int listSize = getListSize(head), count = 0, finalSum = 0;
        int startCounting = listSize - k;
        Node temp = head;

        System.out.println(listSize +" "+startCounting);
        while (temp != null){
            if (count >= startCounting){
                finalSum += temp.data;
            }
            count++;
            temp = temp.next;
        }
        return finalSum;
    }

    int getListSize(Node head){
        int size = 0;
        Node temp = head;
        while(temp != null){
            size ++;
            temp = temp.next;
        }
        return size;
    }


    public static void main(String[] args) {
        Node node = new Node();
        FindLastKSum find = new FindLastKSum();

        node.head = new Node(5);
        node.head.next = new Node(9);
        node.head.next.next = new Node(6);
        node.head.next.next.next = new Node(3);
        node.head.next.next.next.next = new Node(4);
        node.head.next.next.next.next.next = new Node(10);

        System.out.println(find.sum(node.head, 3));
    }
}
