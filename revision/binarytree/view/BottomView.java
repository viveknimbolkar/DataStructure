package revision.binarytree.view;

import java.util.*;

import revision.binarytree.view.Pair;

public class BottomView {

    static class CustomNode {
        int hd;
        int data;
        CustomNode left, right;

        CustomNode(int data) {
            this.data = data;
            this.hd = Integer.MAX_VALUE;
            this.left = this.right = null;
        }
        CustomNode(){}
    }

    ArrayList<Integer> bottomView(CustomNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<CustomNode> q = new LinkedList<>();
        root.hd = 0;
        q.add(root);

        while (!q.isEmpty()) {
            CustomNode temp = q.remove();
            int hd = temp.hd;
            map.put(hd, temp.data);
            if (temp.left != null) {
                temp.left.hd = hd - 1;
                q.add(temp.left);
            }

            if (temp.right != null) {
                temp.right.hd = hd + 1;
                q.add(temp.right);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }

        return ans;
    }

    public static void main(String[] args) {
        BottomView bv = new BottomView();
        CustomNode root = new CustomNode();
        root = new CustomNode(1);
        root.left = new CustomNode(2);
        root.right = new CustomNode(3);
        root.left.left = new CustomNode(4);
        root.left.right = new CustomNode(5);
        root.right.left = new CustomNode(6);
        root.right.right = new CustomNode(7);

        System.out.println(bv.bottomView(root));
    }
}