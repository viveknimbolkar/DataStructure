package linkedlist.singly;

import predefined.Node;

import java.util.ArrayList;

//https://leetcode.com/problems/palindrome-linked-list/
public class PalindromeLinkedList {

    boolean isPalindrome(Node head) {
        ArrayList<Integer> list = new ArrayList<>();
        Node curr = head;

        // copy all element into list
        while (curr != null){
            list.add(curr.data);
            curr = curr.next;
        }

        int i = 0, j = list.size()-1;
        // traverse towards each other and in every iteration check for the equal element
        while (i < j){
            if (list.get(i) != list.get(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeLinkedList palin = new PalindromeLinkedList();

        Node head = new Node();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        System.out.println("Is palindromic list: "+palin.isPalindrome(head));

    }
}
