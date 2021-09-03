//package linkedlist.singly;
//
//public class MergeSortOnLL {
//    private static Node head;
//    static class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    //sort the single list
//    public static Node sort(Node leftList, Node rightList){
//        if (leftList == null) return rightList;
//        if (rightList == null) return leftList;
//
//        Node resultNode = null;
//        //now compare each node of left and right list
//        if (leftList.data <= rightList.data){
//            resultNode = leftList;
//            resultNode.next = sort(leftList.next, rightList);
//        }else {
//            resultNode = rightList;
//            rightList.next = sort(leftList,rightList.next);
//        }
//        return resultNode;
//    }
//
//    //merge two lists i.e. left and right
//    public static Node merge(Node node){
//        if (node == null || node.next == null)
//            return head;
//
//        //get the middle node of the list
//        Node middleNode = getMiddle(node);
//        //set the next of middle null (this will terminate list traversal while dividing a list into two parts)
//        middleNode = null;
//
//        //sort the half left list
//        Node leftList = merge(node);
//        //sort the half right list
//        Node rightList = merge(node.next);
//
//        //Now merge two sorted lists
//        Node sortedList = sort(leftList,rightList);
//
//        return sortedList;
//    }
//
//    static Node getMiddle(Node node){
//        Node slow = head, fast = head;
//        while (fast != null && fast.next.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow;
//    }
//
//    public void printList(Node node){
//        while (node != null){
//            System.out.print(node.data+" ");
//            node = node.next;
//        }
//    }
//
//    public static void main(String[] args) {
//        MergeSortOnLL ms = new MergeSortOnLL();
//
//        ms.head = new Node(10);
//        ms.head.next = new Node(65);
//        ms.head.next.next = new Node(84);
//        ms.head.next.next.next  = new Node(12);
//        ms.head.next.next.next.next = new Node(5);
//        ms.head.next.next.next.next.next = new Node(54);
//
//        ms.printList(ms.head);
//        ms.merge(ms.head);
//        ms.printList(ms.head);
//    }
//}
