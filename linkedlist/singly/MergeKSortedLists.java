package linkedlist.singly;

import predefined.Node;

public class MergeKSortedLists {

    Node mergeList(Node[] arr, int k){
        Node tempList = new Node();

        for (int i = 0; i < k; i++) {
            Node tempInsiderList = arr[i].head;

            while (tempInsiderList.next != null){
                System.out.print(tempInsiderList.data+" ");
                tempList = tempInsiderList;
                tempList = tempList.next;
                tempInsiderList = tempInsiderList.next;
            }
        }
        System.out.println();

        tempList.printList();

        return arr[0];
    }

    public static void main(String[] args) {
        MergeKSortedLists merge = new MergeKSortedLists();
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        Node n = new Node();
        int k = 4;

        n1.head = new Node(1);
        n1.head.next = new Node(2);
        n1.head.next.next = new Node(3);

        n2.head = new Node(4);
        n2.head.next = new Node(5);

        n3.head = new Node(5);
        n3.head.next = new Node(6);

        n4.head = new Node(7);
        n4.head.next = new Node(8);


        Node[] arr = {n1,n2,n3,n4};

        n.printList(merge.mergeList(arr,k));


    }
}
