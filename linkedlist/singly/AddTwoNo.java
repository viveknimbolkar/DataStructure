package linkedlist.singly;

public class AddTwoNo {
    Node head1;
    Node head2;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void printList(Node node) {
        while (node != null){
            System.out.print(node.data+" ");
            node = node.next;
        }
    }

    Node addTwoLists(Node first, Node second){
        int carry = 0;
        int sum = 0;
        int sum2 = 0;
        //get last element of first list
        Node tempF = first;
        while (tempF != null){
            if (tempF.next == null){
                sum+= tempF.data;;
                System.out.println("last nodef:"+tempF.data);
            }
            tempF = tempF.next;
        }

        //get last element of second list
        Node tempS = second;
        while (tempS != null){
            if (tempS.next == null){
                sum+= tempS.data;
                System.out.println("last nodes:"+tempS.data);
            }
            tempS = tempS.next;
        }

        System.out.println("sum: "+sum);
        System.out.println((sum/10)%10);
        carry = (sum/10)%10;

        //get second element of first list
        Node tempF1 = first;
        while (tempF1 != null){
            if (tempF1.next == null){
                sum2+= tempF1.data;;
                System.out.println("last nodef:"+tempF1.data);
            }
            tempF1 = tempF1.next;
        }

        //get second element of second list
        Node tempF2 = second;
        while (tempF2 != null){
            if (tempF2.next == null){
                sum2+= tempF2.data;
                System.out.println("last nodes:"+tempF2.data);
            }
            tempF2 = tempF2.next;
        }

        System.out.println(sum2+carry);

        return first;
    }

    public static void main(String[] args) {
        AddTwoNo add = new AddTwoNo();
        add.head1 = new Node(4);
        add.head1.next = new Node(5);

        add.head2 = new Node(3);
        add.head2.next = new Node(4);
        add.head2.next.next = new Node(25);

        add.printList(add.head1);
        add.printList(add.head2);

        add.addTwoLists(add.head1, add.head2);
    }
}
