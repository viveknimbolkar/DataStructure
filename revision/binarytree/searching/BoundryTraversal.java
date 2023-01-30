package revision.binarytree.searching;

import predefined.TNode;

import java.util.ArrayList;

public class BoundryTraversal {

    public static void main(String[] args) {
        BoundryTraversal boundryTraversal = new BoundryTraversal();
        TNode root = new TNode(1);
        root.left = new TNode(2);
        root.right = new TNode(3);
        root.left.left = new TNode(4);
        root.left.right = new TNode(5);
        root.right.right = new TNode(7);
        root.right.left = new TNode(6);

        System.out.println(boundryTraversal.getBoundryNodes(root));
    }

    private ArrayList<Integer> getBoundryNodes(TNode root) {
       ArrayList<Integer> nodes = new ArrayList<>();
       nodes.add(root.data);
       if (root.left == null && root.right == null) return nodes;
       addLeftBoundryNodes(root.left, nodes);
       addLeaves(root, nodes);
       addRightBoundryNodes(root.right, nodes);
       return nodes;
    }

    private void addRightBoundryNodes(TNode root, ArrayList<Integer> nodes) {
        if (root == null) return;

        if (root.right != null){
            addRightBoundryNodes(root.right, nodes);
            nodes.add(root.data);
        }else if (root.left != null){
            addRightBoundryNodes(root.left, nodes);
            nodes.add(root.data);
        }
    }

    private void addLeaves(TNode root, ArrayList<Integer> nodes) {
        if (root == null)return;
        addLeaves(root.left,nodes);
        if (root.left == null && root.right == null){
            nodes.add(root.data);
        }
        addLeaves(root.right,nodes);
    }

    private void addLeftBoundryNodes(TNode root, ArrayList<Integer> nodes) {
        if (root == null) return;

        if (root.left != null){
            nodes.add(root.data);
            addLeftBoundryNodes(root.left,nodes);
        }else if (root.right != null){
            nodes.add(root.data);
            addLeftBoundryNodes(root.right,nodes);
        }
    }
}
