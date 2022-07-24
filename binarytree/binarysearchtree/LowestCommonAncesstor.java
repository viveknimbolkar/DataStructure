package binarytree.binarysearchtree;

import predefined.TNode;

public class LowestCommonAncesstor {
    TNode root;
    TNode lowestCommonAncestor(TNode root, TNode p, TNode q) {
        if (root == null) return root;
        int curr = root.data;

        // if current data of node is less than p and q then move right
        if (curr < p.data && curr < q.data){
            return lowestCommonAncestor(root.right,p,q);
        }

        // if current data of node is less than p and q then move left
        if(curr > p.data && curr > q.data){
            return lowestCommonAncestor(root.left,p,q);
        }
        return root;
    }

    public static void main(String[] args) {
        LowestCommonAncesstor low = new LowestCommonAncesstor();

        low.root = new TNode(6);
        low.root.left = new TNode(2);
        low.root.right = new TNode(8);
        low.root.left.left = new TNode(0);
        low.root.left.right = new TNode(4);
        low.root.left.right.left = new TNode(3);
        low.root.left.right.right = new TNode(5);
        low.root.right.left = new TNode(7);
        low.root.right.right = new TNode(9);

        System.out.println(low.lowestCommonAncestor(low.root,low.root.left,low.root.right).data);
    }
}
