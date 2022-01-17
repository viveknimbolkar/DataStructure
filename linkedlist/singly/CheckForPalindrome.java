package linkedlist.singly;

import predefined.Node;

public class CheckForPalindrome {

    boolean isPalindrome(Node node){
        Node mid = node, last = node;

        while (last != null && last.next != null){
            mid = mid.next;
            last = last.next.next;
        }

        last = node; // setting last node as a head
        mid = reverseList(mid);

        //now check reverse list and normal list parallelly
        while (mid != null){
            if (mid.data != last.data)
                return false;
            mid = mid.next;
            last = last.next;
        }
        return true;
    }

    // Reverse the linked list
    Node reverseList(Node head){
        Node prev = null, nextNode = null;

        while (head != null){
            nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }

    public static void main(String[] args) {
        CheckForPalindrome check = new CheckForPalindrome();
        Node node = new Node();

        node.pushAtBeg(1);
        node.pushAtBeg(2);
        node.pushAtBeg(3);
        node.pushAtBeg(2);
        node.pushAtBeg(1);
        node.printList();
        System.out.println("Is palindrome list: "+check.isPalindrome(node.head));
    }
}
