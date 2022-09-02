package binarytree;

import predefined.TNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/average-of-levels-in-binary-tree/
public class AverageOfLevels {
    static TNode root;

    List<Double> averageOfLevels(TNode root) {
        List<Double> averageOfLevels = new ArrayList<>();
        Queue<TNode> q = new LinkedList<>();

        // if tree is empty then return averageOfLevels
        if (root == null) return averageOfLevels;

        q.offer(root);
        // now traverse until we visited all the tree nodes
        while (!q.isEmpty()){
            ArrayList<Integer> levelNodes = new ArrayList<>();
            int levelNumber = q.size();

            // now visit all the nodes recursively
            for (int i = 0; i < levelNumber; i++) {
                if (q.peek().left != null) q.offer(q.peek().left);
                if (q.peek().right != null) q.offer(q.peek().right);
                levelNodes.add(q.poll().data);
            }

            // now we have all the nodes of level n in levelNodes
            // find out the average of all the nodes
            double totalSum = 0;
            for (int i = 0; i < levelNodes.size(); i++) {
                totalSum += levelNodes.get(i);
            }
            averageOfLevels.add(totalSum/levelNodes.size());

        }

        return averageOfLevels;
    }

    public static void main(String[] args) {
        AverageOfLevels avg = new AverageOfLevels();

        root = new TNode(3);
        root.left = new TNode(9);
        root.right = new TNode(20);
        root.right.left = new TNode(15);
        root.right.right = new TNode(7);

        System.out.println("Average of levels is: "+avg.averageOfLevels(root));

    }
}
