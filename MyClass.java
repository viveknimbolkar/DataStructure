import predefined.Node;

import java.util.Scanner;

class MyClass{
    public static void main(String[] args) {
        Node n = new Node();
        n.pushAtEnd(2);
        n.pushAtEnd(3);
        n.pushAtEnd(4);
        n.pushAtEnd(5);
        n.printList(n.head);
    }
}