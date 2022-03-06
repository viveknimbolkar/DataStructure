package binarytree;

import predefined.TNode;

// https://practice.geeksforgeeks.org/problems/sum-of-binary-tree/1/
public class SumOfBT {
    TNode root;

    SumOfBT(int data){this.root = new TNode(data);}
    SumOfBT(){}

    int getSum(){
        return getSumOfBT(root);
    }

    int getSumOfBT(TNode root){
        if (root == null) return 0;
        return root.data + getSumOfBT(root.left) + getSumOfBT(root.right);
    }


    public static void main(String[] args) {
        SumOfBT sum = new SumOfBT();

        sum.root = new TNode(1);
        sum.root.left = new TNode(2);
        sum.root.right = new TNode(3);
        sum.root.left.left = new TNode(4);
        sum.root.right.right = new TNode(5);

        System.out.println("Sum is: "+sum.getSum());


    }
}
