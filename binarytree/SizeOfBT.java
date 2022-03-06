package binarytree;
// https://practice.geeksforgeeks.org/problems/size-of-binary-tree/1/?
import predefined.TNode;

public class SizeOfBT {

    TNode root;

    int getSize(){
        return getSize(root);
    }

    int getSize(TNode root){
        if (root == null) return 0;
        return getSize(root.left) + 1 + getSize(root.right);
    }

    SizeOfBT(int d){this.root = new TNode(d);}
    SizeOfBT(){}
    public static void main(String[] args) {
        SizeOfBT size = new SizeOfBT();
        TNode node = new TNode();

        size.root = new TNode(1);
        size.root.left = new TNode(10);
        size.root.left.right = new TNode(14);
        size.root.right = new TNode(45);

        System.out.println("BT size: "+size.getSize());
    }
}
