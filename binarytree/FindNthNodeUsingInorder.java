package binarytree;

import predefined.TNode;

public class FindNthNodeUsingInorder {

    TNode root;
    FindNthNodeUsingInorder(int data){this.root= new TNode(data);}
    FindNthNodeUsingInorder(){this.root=null;}

    int findNthNode(TNode node,int n){
        if (node==null) return -1;
        int count = 0;
        if (count <= n){
            //first recurr on left side
            findNthNode(node.left,n);
            count++;
            //if node is found
            if (count == n) System.out.println(node.data);
            //recurr on right side
            findNthNode(node.right,n);
        }
        return -1;
    }

    public static void main(String[] args) {
        FindNthNodeUsingInorder findInorder = new FindNthNodeUsingInorder();
        findInorder.root = new TNode(10);
        findInorder.root.left = new TNode(20);
        findInorder.root.right = new TNode(30);
        findInorder.root.left.left = new TNode(40);
        findInorder.root.left.right = new TNode(50);
        findInorder.findNthNode(findInorder.root,4);
    }
}
