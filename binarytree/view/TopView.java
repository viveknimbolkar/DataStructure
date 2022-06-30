package binarytree.view;

import predefined.TNode;
// https://www.youtube.com/watch?v=Et9OCDNvJ78&list=PLgUwDviBIf0q8Hkd7bK2Bpryj2xVJk8Vk&index=23
import java.util.*;

public class TopView {
    TNode root;

    // a pair to add into queue
    static class Pair{
        TNode node;
        int level;
        Pair(TNode node,int level){
            this.node = node;
            this.level = level;
        }
    }

    ArrayList<Integer> topView(TNode root){
        ArrayList<Integer> ans = new ArrayList<>();
        // Map store (line number, first node of verticle line)
        Map<Integer,Integer> map = new TreeMap<>();
        // q store (node,level)
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));

        // go left node and right node iteratively
        while (!q.isEmpty()){
            // get the verticle line and node
            Pair itr = q.remove();
            int line = itr.level;
            TNode temp = itr.node;

            // add node in map accordingly
            if (map.get(line) == null) map.put(line,temp.data);
            // add nodes with increase in levels by -line or +line
            if (temp.left != null) q.add(new Pair(temp.left,line-1));
            if (temp.right != null) q.add(new Pair(temp.right,line+1));
        }

        // Shift all the nodes from map to ans list
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
                ans.add(entry.getValue());
        }

        return ans;
    }

    public static void main(String[] args) {
        TopView top = new TopView();

        top.root = new TNode(1);
        top.root.left = new TNode(2);
        top.root.left.left = new TNode(3);
        top.root.left.right = new TNode(4);
        top.root.left.right.left = new TNode(5);

        top.root.right = new TNode(6);
        top.root.right.right = new TNode(8);
        top.root.right.right = new TNode(7);

        System.out.println(top.topView(top.root));

    }
}
