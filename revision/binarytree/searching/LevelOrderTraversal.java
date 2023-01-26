package revision.binarytree.searching;

import predefined.TNode;

public class LevelOrderTraversal {
    static TNode root;
    public static void main(String[] args) {
        root = new TNode(1);
        root.left = new TNode(2);
        root.right = new TNode(5);
        root.left.left = new TNode(3);
        root.left.right = new TNode(4);

        levelOrder(root);
    }

    private static void levelOrder(TNode root) {
        int height = height(root);
        for (int i = 0; i <= height; i++) {
            currentLevel(root,i);
        }
    }

    private static int height(TNode root) {
        if (root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        if (left > right) return left+1;
        else return right+1;
    }

    private static void currentLevel(TNode root, int level) {
        if (root == null) return;
        if (level == 1) System.out.println(root.data);
        else if (level > 1){
            currentLevel(root.left,level-1);
            currentLevel(root.right,level-1);
        }
    }
}
