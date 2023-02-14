package revision.binarytree;

import predefined.TNode;

public class HeightOfTree {

    public static void main(String[] args) {
        HeightOfTree height = new HeightOfTree();
        TNode root = new TNode(1);
        root.left = new TNode(2);
        root.right = new TNode(3);
        root.left.left = new TNode(4);
        root.left.right = new TNode(5);
        root.right.left = new TNode(6);
        root.right.right = new TNode(7);

        System.out.println(height.heightOfTree(root));
    }

    private int heightOfTree(TNode root) {
        if (root == null) return 0;

        int left = heightOfTree(root.left);
        int right = heightOfTree(root.right);

        if (left > right) return left+1;
        else return right+1;
    }
}
