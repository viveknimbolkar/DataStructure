package binarytree;

import predefined.TNode;

public class UnivaluetedBinaryTree {
    TNode root;
    UnivaluetedBinaryTree(int data){this.root = new TNode(data);}
    UnivaluetedBinaryTree(){this.root=null;}

    boolean isSame(TNode node,int val){
        if (root == null) return false;
        if (node.data != val) return false;
        boolean left = isSame(node.left,val);
        boolean right = isSame(node.right,val);

        return left && right;
    }

    boolean isUnivaluated(TNode node){
        return isSame(node,node.data);
    }

    public static void main(String[] args) {
        UnivaluetedBinaryTree tree = new UnivaluetedBinaryTree();
        tree.root = new TNode(1);
        tree.root.left = new TNode(1);
        tree.root.right = new TNode(1);
        tree.root.left.right = new TNode(1);
        tree.root.right.right = new TNode(1);

        tree.root.inorder(tree.root);

        System.out.println(tree.isUnivaluated(tree.root));

    }
}
