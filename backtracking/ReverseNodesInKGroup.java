package backtracking;

import predefined.Node;

public class ReverseNodesInKGroup {

    Node reverseKGroup(Node head, int k) {
      Node curr = head;
      int count = 0;
      // reach to the last node k+1 node
      while (curr != null && count != k){
          curr = curr.next;
          count++;
      }

      if (count == k){
          curr = reverseKGroup(curr,k); // recursively reach to the k+1 node i.e. last node

          // reverse the nodes upto k
          while (count-- > 0){
              Node temp = head.next;
              head.next = curr;
              curr = head;
              head = temp;
          }
          head = curr;
      }
      // now we have the final reversed list
      return head;
    }

    public static void main(String[] args) {
        ReverseNodesInKGroup rev = new ReverseNodesInKGroup();
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);
        node.next.next.next.next.next = new Node(6);
        node.next.next.next.next.next.next = new Node(7);
        node.next.next.next.next.next.next.next = new Node(8);

        rev.reverseKGroup(node,3);
        node.printList(node);
    }
}
