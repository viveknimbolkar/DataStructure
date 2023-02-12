package revision.binarytree.view;

import predefined.TNode;
import revision.binarytree.view.Pair;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;


public class TopView {

   static void topView(TNode root){
       HashMap<Integer,Integer> map = new HashMap<>();
       Queue<Pair> q = new LinkedList<>();
       q.add(new Pair(root,0));

       while (!q.isEmpty()){
           Pair curr = q.poll();
           int level = curr.level;
           TNode node = curr.node;
           map.put(node.data,level);
           if (node.left != null) q.add(new Pair(node.left,level-1));
           if (node.right != null) q.add(new Pair(node.right,level+1));
       }

    }

    public static void main(String[] args) {


        TNode root = new TNode(1);
        root.left = new TNode(2);
        root.right = new TNode(3);
        root.left.left = new TNode(4);
        root.left.right = new TNode(5);
        root.right.left = new TNode(6);
        root.right.right = new TNode(7);

        topView(root);
    }
}
