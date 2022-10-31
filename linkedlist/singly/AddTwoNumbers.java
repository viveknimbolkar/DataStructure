package linkedlist.singly;

import predefined.Node;

//https://leetcode.com/problems/add-two-numbers/
public class AddTwoNumbers {
    // method-2: optimized
    Node addTwoNum(Node l1, Node l2){
        Node dummy = new Node(0);
        Node curr = dummy;

        // now iterate until we reach the end of l1 or l2 or carry remail == 1
        // while iterating build new dummy linked list too
        int carry = 0;
        while (l1 != null || l2 != null || carry == 1){
            int sum = 0;
            if (l1 != null){
                sum += l1.data;
                l1 = l1.next;
            }

            if (l2 != null){
                sum += l2.data;
                l2 = l2.next;
            }
            sum += carry; // if we have carry remain then add into the sum
            carry = sum/10; // get carry if form

            // create a node and add into the linked list
            Node newNode = new Node(sum%10); // get the original sum of two digits
            curr.next = newNode;
            curr = curr.next;

        }

        return dummy.next;
    }

    // method -1: brute force
    Node addTwoNumbers(Node l1, Node l2) {
        String l1num = "", l2num = "";

        // generate the string of two list integers
        while (l1 != null && l2 != null){
            l1num += l1.data;
            l2num += l2.data;
            l1 = l1.next;
            l2 = l2.next;
        }

        // reverse the two digits
        String[] reversedDigit = reverse(l1num,l2num);
        // get the sum of numbers
        Integer finalSum = Integer.parseInt(reversedDigit[0])+Integer.parseInt(reversedDigit[1]);
        String tempstr = finalSum.toString();

        // create a final linked list
        Node finalList = new Node();
        for (int i = 0; i < tempstr.length(); i++)
            finalList.pushAtEnd(Character.getNumericValue(tempstr.charAt(i)));

        return finalList;
    }

    // reverse the strings
    String[] reverse(String s1, String s2){
        String[] ans = new String[2];
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        ans[0] = sb.toString();
        sb = new StringBuilder(s2);
        sb.reverse();
        ans[1] = sb.toString();
        return ans;
    }

    public static void main(String[] args) {
        AddTwoNumbers addtwo = new AddTwoNumbers();

        Node h1 = new Node(2);
        h1.next = new Node(4);
        h1.next.next = new Node(3);

        Node h2 = new Node(5);
        h2.next = new Node(6);
        h2.next.next = new Node(4);

        h1.printList(addtwo.addTwoNum(h1,h2));

    }
}
