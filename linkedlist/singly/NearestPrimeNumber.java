package linkedlist.singly;
// find the nearest prime number and add it into list
import predefined.Node;

public class NearestPrimeNumber {

    // TODO: not working
    Node primeList(Node head){
        while (head.next != null){
            if (!isPrimeNum(head.data)){
                head.data = getNearestNumber(head.data);
            }
            head = head.next;
        }

        return head;

    }

    // find the nearest prime number
    int getNearestNumber(int num){
        int nextPrimeNumber = num;
        int previousPrimeNumber = num;

        // traverse until we find the next greater prime number
        while (!isPrimeNum(nextPrimeNumber))
            nextPrimeNumber++;

        // traverse until we find the previous greater prime number
        while (!isPrimeNum(previousPrimeNumber))
            previousPrimeNumber--;

        // store the gap of two prime numbers
        int prevNumGap = num-previousPrimeNumber;
        int nextNumGap = nextPrimeNumber-num;

        // return the nearest number either previous and next depending on gap
        if (prevNumGap < nextNumGap) return previousPrimeNumber;
        else return nextPrimeNumber;
    }

    // check for prime number
    boolean isPrimeNum(int num){
        if (num <= 1) return false;
        else if (num == 2) return true;
        else if (num%2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(num); i+=2)
            if (num%i == 0) return false;

        return true;
    }

    public static void main(String[] args) {
        NearestPrimeNumber npn = new NearestPrimeNumber();
        Node node = new Node();
        node.head = new Node(2);
        node.head.next = new Node(6);
        node.head.next.next = new Node(10);

        Node node2 = new Node();
        node2.head = new Node(1);
        node2.head.next = new Node(15);
        node2.head.next.next = new Node(20);


        npn.primeList(node2.head);
        node.printList();
    }
}
