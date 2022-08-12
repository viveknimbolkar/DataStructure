package binarytree.binarysearchtree.traversal;

import predefined.TNode;

public class FloorBST {
    static TNode root;
    int findFloor(TNode root,int target){
        int floor = -1;

        while (root != null){
            if (target == root.data){
                floor = root.data;
                return floor;
            }
            if (target > root.data){
                floor = root.data;
               root= root.right;
            }else {
                root = root.left;
            }
        }

        return floor;
    }

    public static void main(String[] args) {
        FloorBST floor = new FloorBST();

        root = new TNode(8);
        root.left = new TNode(4);
        root.left.left = new TNode(2);
        root.left.right = new TNode(6);
        root.right = new TNode(12);
        root.right = new TNode(14);
        root.right.left = new TNode(10);

        System.out.println(floor.findFloor(root,11));

    }
}
