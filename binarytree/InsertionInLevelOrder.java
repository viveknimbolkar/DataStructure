package binarytree;

import predefined.TNode;

import java.util.LinkedList;
import java.util.Queue;
// https://www.geeksforgeeks.org/insertion-in-a-binary-tree-in-level-order/

public class InsertionInLevelOrder {
    TNode root;

    InsertionInLevelOrder(int data){this.root = new TNode(data);}
    InsertionInLevelOrder(){};

    void levelOrderInsertion(TNode node, int data){
        if (node == null) return;
        //use queue to mark or store visited nodes
        Queue<TNode> q = new LinkedList<>();
        q.add(node);

        //iterate upto the queue is not get empty
        while (!q.isEmpty()){
            node = q.peek();
            q.remove();
            //if we found any left empty node
            if (node.left == null){
                node.left = new TNode(data);
                break;
            }else q.add(node.left);//mark left node as visited

            //if we find right empty node
            if (node.right == null){
                node.right = new TNode(data);
                break;
            }else  q.add(node.right); //mark right node as visited
        }
    }

    public static void main(String[] args) {
        InsertionInLevelOrder insert = new InsertionInLevelOrder();
        insert.root = new TNode(10);
        insert.root.left = new TNode(11);
        insert.root.left.left = new TNode(7);
        insert.root.right = new TNode(9);
        insert.root.right.right = new TNode(8);
        insert.root.right.left = new TNode(15);

        insert.levelOrderInsertion(insert.root,12);
        insert.root.inorder(insert.root);

    }

}
