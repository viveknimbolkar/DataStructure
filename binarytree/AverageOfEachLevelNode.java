package binarytree;

import predefined.TNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/average-of-levels-in-binary-tree/
public class AverageOfEachLevelNode {
    static TNode root;
    List<Double> averageOfLevels(TNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TNode> q = new LinkedList<>();

        // add root node into queue
        q.add(root);

        while (!q.isEmpty()){
            int size = q.size();
            long sum = 0;
            // iterate all the nodes in the queue
            for (int i = 0; i < size; i++) {
                TNode currNode = q.poll();
                sum += currNode.data;

                // now if the node has left go left or has right go right
                if (currNode.left != null) q.add(currNode.left);
                if (currNode.right != null) q.add(currNode.right);
            }
            // get the average of the levels nodes
            ans.add((double)sum/size);
        }
        return ans;
    }

    public static void main(String[] args) {
        AverageOfEachLevelNode avg = new AverageOfEachLevelNode();
        root = new TNode(3);
        root.left = new TNode(9);
        root.right = new TNode(20);
        root.right.right = new TNode(7);
        root.right.left = new TNode(15);
        System.out.println(avg.averageOfLevels(root));
    }
}
