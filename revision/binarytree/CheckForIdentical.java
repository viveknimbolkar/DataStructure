package revision.binarytree;

import predefined.TNode;

public class CheckForIdentical {

    boolean isIdentical(TNode a, TNode b){
        if (a == null || b == null) return true;
        if (a.data != b.data) return false;
        return isIdentical(a.left, b.left) && isIdentical(a.right,b.right);
    }

    public static void main(String[] args) {
        CheckForIdentical check = new CheckForIdentical();
        TNode tree1 = new TNode(10);
        tree1.left = new TNode(20);
        tree1.left.left = new TNode(40);
        tree1.left.left.left = new TNode(5);
        tree1.left.right = new TNode(0);
        tree1.right = new TNode(176);

        TNode tree2 = new TNode(10);
        tree2.left = new TNode(20);
        tree2.left.left = new TNode(40);
        tree2.left.left.left = new TNode(5);
        tree2.left.right = new TNode(0);
        tree2.right = new TNode(176);

        System.out.println(check.isIdentical(tree1,tree2));
    }
}
