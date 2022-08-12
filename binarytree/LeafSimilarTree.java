package binarytree;
//https://leetcode.com/problems/leaf-similar-trees/

import predefined.TNode;

import java.util.ArrayList;

public class LeafSimilarTree {
    static TNode root1, root2;

    boolean leafSimilar(TNode root1, TNode root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        getLeafNodes(root1,list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        getLeafNodes(root2,list2);

        // if the size of two leaf list is not same then we can conclude that leafs are not similar
        if(list1.size() != list2.size()) return false;

        // now compare each leaf node of every tree
        int i = 0;
        while (i < list1.size()){
            if (list1.get(i) != list2.get(i)) return false;
            i++;
        }
        return true;
    }

    void getLeafNodes(TNode root,ArrayList<Integer> leafList){
        // when we reach at the leaf node just add into the carrying leafList
        if (root.left == null && root.right == null) leafList.add(root.data);
        // move left if left is not null
        if (root.left != null) getLeafNodes(root.left,leafList);
        // move right if right is not null
        if (root.right != null) getLeafNodes(root.right,leafList);
    }

    public static void main(String[] args) {
        LeafSimilarTree leaf = new LeafSimilarTree();

        root1 = new TNode(5);
        root1.left = new TNode(4);
        root1.left.left = new TNode(3);
        root1.left.left.left = new TNode(1);
        root1.right = new TNode(6);
        root1.right.right = new TNode(7);

        root2  = new TNode(1);
        root2.left = new TNode(2);
        root2.left.left = new TNode(3);
        root2.left.right = new TNode(4);
        root2.right = new TNode(5);
        root2.right.right = new TNode(6);

        System.out.println("Is leaf similar trees: "+leaf.leafSimilar(root1,root2));

    }
}
