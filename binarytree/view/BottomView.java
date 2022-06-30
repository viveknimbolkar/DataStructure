package binarytree.view;

import java.util.*;

//https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1/
// https://www.youtube.com/watch?v=0FtVY6I4pB8&list=PLgUwDviBIf0q8Hkd7bK2Bpryj2xVJk8Vk&index=24
public class BottomView {
    Node root;
    static class Node{
        int hd, data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    ArrayList<Integer> bottomView(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Map<Integer,Integer> map = new TreeMap<>();
        Queue<Node> q = new LinkedList<>();
        root.hd = 0;
        q.add(root);

        while(!q.isEmpty()){
            Node tmp = q.remove();
            int hd = tmp.hd;
            map.put(hd,tmp.data);
            if(tmp.left != null){
                tmp.left.hd = hd-1;
                q.add(tmp.left);
            }

            if(tmp.right != null){
                tmp.right.hd = hd+1;
                q.add(tmp.right);
            }
        }


        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            ans.add(entry.getValue());
        }

        return ans;
    }

    public static void main(String[] args) {
        BottomView btn = new BottomView();

        btn.root = new Node(1);
        btn.root.left = new Node(2);
        btn.root.left.left = new Node(3);
        btn.root.left.right = new Node(4);
        btn.root.left.right.left = new Node(5);

        btn.root.right = new Node(6);
        btn.root.right.right = new Node(7);
        btn.root.right.left = new Node(8);

        System.out.println(btn.bottomView(btn.root));
    }
}
