package linkedlist.singly;

import predefined.Node;
// https://practice.geeksforgeeks.org/problems/modular-node/1/
public class ModularNode {

    //Method-1
    int findModularNode(Node head, int k){
        int modularNode = 0, counter = 0;
        Node temp = head, temp2 = head;
        while (temp != null){
            if (counter % k == 0)
                modularNode = counter;
            temp = temp.next;
            counter++;
        }
        int i = 1;
        while (temp2 != null && i < modularNode){
            temp2 = temp2.next;
            i++;
        }

        return temp2.data;
    }

    //Method 2: Optimized
    int findModularNode2(Node head, int k){
        int answer = -1, counter = 1;
        while(head != null){
            if(counter % k == 0)
                answer = head.data;
            counter++;
            head = head.next;
        }
        return answer;
    }

    public static void main(String[] args) {
        ModularNode modular = new ModularNode();
        Node n = new Node();

        n.head = new Node(1);
        n.head.next = new Node(2);
        n.head.next.next = new Node(3);
        n.head.next.next.next = new Node(4);
        n.head.next.next.next.next = new Node(5);
        n.head.next.next.next.next.next = new Node(6);
        n.head.next.next.next.next.next.next = new Node(7);

        int k = 3;
        System.out.println(modular.findModularNode2(n.head,k));
    }
}
