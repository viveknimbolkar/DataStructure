package linkedlist.singly;

import predefined.Node;
// https://practice.geeksforgeeks.org/problems/multiply-two-linked-lists/1/
public class ProductOfTwoList {

    long multiplyTwoLists(Node l1,Node l2){
        String list1Items = "", list2Items = "";

        while (l1 != null){
            list1Items += String.valueOf(l1.data);
            l1 = l1.next;
        }
        while (l2 != null){
            list2Items += String.valueOf(l2.data);
            l2 = l2.next;
        }
        long a = Long.parseLong(list1Items);
        long b = Long.parseLong(list2Items);
        System.out.println(list1Items+" "+list2Items);
        return a*b;
    }

    public static void main(String[] args) {
        ProductOfTwoList product = new ProductOfTwoList();
        Node list1 = new Node();
        Node list2 = new Node();

        list1.pushAtBeg(32);
        list1.pushAtBeg(245454);

        list2.pushAtBeg(1556897845);
        list2.pushAtBeg(2445);
        list2.pushAtBeg(3);

        System.out.println("multiplication "+product.multiplyTwoLists(list1.head,list2.head));
    }
}
