package binarytree.traversal;

import predefined.TNode;

import java.util.ArrayList;

// to traverse all the boundry nodes of tree. Use vertical line method
public class BoundryTraversal {
    TNode root;

    // main boundry function
    ArrayList<Integer> getBoundryNodes(TNode root){
        ArrayList<Integer> ans = new ArrayList<>();
        if (isLeaf(root)) ans.add(root.data);
        // first add left boundry nodes
        addLeftBoundryNodes(root, ans);
        // add leaves nodes
        addLeaves(root,ans);
        // add left boundry nodes
        addRightBoundryNodes(root, ans);
        return ans;
    }

    void addLeftBoundryNodes(TNode root, ArrayList<Integer> ans) {
        TNode curr = root.left;
        while (curr != null){
            if (isLeaf(curr)==false) ans.add(curr.data);
            if (curr.left != null) curr = curr.left;
            else curr = curr.right;
        }
    }

    void addRightBoundryNodes(TNode root, ArrayList<Integer> ans) {
        TNode curr = root.right;
        ArrayList<Integer> temp = new ArrayList<>();
        while (curr != null){
            if (isLeaf(curr)==false) temp.add(curr.data);
            if (curr.right != null) curr = curr.right;
            else curr = curr.left;
        }

        int j;
        for (j = temp.size()-1; j >= 0 ; j--) {
            ans.add(temp.get(j));
        }
    }

    void addLeaves(TNode root, ArrayList<Integer> ans) {
        if (isLeaf(root)==false) {
            ans.add(root.data); return;
        }
        if (root.left != null) addLeaves(root.left,ans);
        if (root.right != null) addLeaves(root.right,ans);
    }

    boolean isLeaf(TNode node){
        return (node.left != null && node.right != null);
    }

    private void addRightBoundryNodes1(TNode root, ArrayList<Integer> nodes) {
        if (root == null) return;

        if (root.right != null){
            addRightBoundryNodes(root.right, nodes);
            nodes.add(root.data);
        }else if (root.left != null){
            addRightBoundryNodes(root.left, nodes);
            nodes.add(root.data);
        }
    }

    private void addLeaves1(TNode root, ArrayList<Integer> nodes) {
        if (root == null)return;
        addLeaves(root.left,nodes);
        if (root.left == null && root.right == null){
            nodes.add(root.data);
        }
        addLeaves(root.right,nodes);
    }

    private void addLeftBoundryNodes1(TNode root, ArrayList<Integer> nodes) {
        if (root == null) return;

        if (root.left != null){
            nodes.add(root.data);
            addLeftBoundryNodes(root.left,nodes);
        }else if (root.right != null){
            nodes.add(root.data);
            addLeftBoundryNodes(root.right,nodes);
        }
    }

    public static void main(String[] args) {
        BoundryTraversal boundry = new BoundryTraversal();
        boundry.root = new TNode(1);
        boundry.root.left = new TNode(2);
        boundry.root.left.left = new TNode(3);
        boundry.root.left.left.right = new TNode(4);
        boundry.root.left.left.right.left = new TNode(5);
        boundry.root.left.left.right.right = new TNode(6);

        boundry.root.right = new TNode(7);
        boundry.root.right.right = new TNode(8);
        boundry.root.right.right.left = new TNode(9);
        boundry.root.right.right.left.right = new TNode(10);
        boundry.root.right.right.left.right = new TNode(11);

        System.out.println(boundry.getBoundryNodes(boundry.root));
    }
}
