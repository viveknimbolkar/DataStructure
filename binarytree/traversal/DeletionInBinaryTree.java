package binarytree.traversal;

import predefined.TNode;

import java.util.LinkedList;
import java.util.Queue;

public class DeletionInBinaryTree {
    public static void main(String[] args) {
        TNode root = new TNode(1);
        root.left = new TNode(2);
        root.right = new TNode(3);
        root.left.right = new TNode(5);
        root.right.left = new TNode(4);
        root.inorder(root);
        delete(root,4);
        System.out.println();
        root.inorder(root);
    }

    private static void delete(TNode root, int delNode) {
        if (root == null) return;

        // check if the root is to be deleted
        if (root.left == null && root.right == null){
            if (root.data == delNode)
            root = null;
            return;
        }

        // if root is not the node to be deleted, then traverse full tree until we find out the delNode
        Queue<TNode> q = new LinkedList<>();
        q.add(root);
        TNode curr = null, keyNode = null;
        while (!q.isEmpty()){
            curr = q.poll();

            // if we found the delNode
            if (curr.data == delNode){
                keyNode = curr;
            }

            if (curr.left != null){
               q.add(curr.left);
            }

            if (curr.right != null){
                q.add(curr.right);
            }
        }

        // after finding delNode, delete the rightmost node
        if (keyNode != null){
            int data = curr.data;
            deleteRightMostDeepestNode(root,curr);
            keyNode.data = data;
        }
    }

    // do level order traversal to delete rightmost node deepest
    private static void deleteRightMostDeepestNode(TNode root, TNode keyNode) {

        Queue<TNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            TNode curr = q.poll();

            if (curr == keyNode){
                curr = null;
                return;
            }

            if (curr.right != null){
                if (curr.right == keyNode){
                    curr.right = null;
                    return;
                }else q.add(curr.right);
            }

            if (curr.left != null){
                if (curr.left == keyNode){
                    curr.left = null;
                    return;
                }else q.add(curr.left);
            }
        }
    }
}











