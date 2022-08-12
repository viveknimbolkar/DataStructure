package binarytree.binarysearchtree;

import predefined.TNode;

import java.util.*;

//https://leetcode.com/problems/find-mode-in-binary-search-tree/
public class FindModeBST {
    static TNode root;

    // optimized approach
    int[] findMode2(TNode root){
        HashMap<Integer,Integer> nodeMapping = new HashMap<>();
        mapNodes(root,nodeMapping);

        // get the element whose frequency is maximum
        int maxi = Integer.MIN_VALUE;
        for (int x:nodeMapping.keySet()) {
            maxi = Math.max(maxi,nodeMapping.get(x));
        }
        // now we have the map key with max frequency

        // store the final result in arraylist because we don't know the size of mode
        ArrayList<Integer> ans = new ArrayList<>();
        for (int x: nodeMapping.keySet()) {
            if (nodeMapping.get(x) == maxi) ans.add(x);
        }

        // convert the array list into plain array to return as a final answer
        int[] finalAns = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            finalAns[i] = ans.get(i);
        }
        return finalAns;

    }

    // get Nodes
    void mapNodes(TNode root, HashMap<Integer,Integer> map){
        if (root == null) return;
        map.put(root.data,map.getOrDefault(root.data,0)+1);
        mapNodes(root.left,map);
        mapNodes(root.right,map);
    }

    // brute force
    int[] findMode(TNode root) {
        ArrayList<Integer> nodes = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        getNodes(root,nodes);
        Collections.sort(nodes);
        System.out.println(nodes);

        int k = 0;
        for (int j = 0; j < nodes.size()-1; j++) {
            if (nodes.get(j).equals(nodes.get(j+1))){
                set.add(nodes.get(j));
            }
        }

        int[] ans = new int[set.size()];
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()){
            ans[k++] = itr.next();
        }
        return ans;
    }

    void getNodes(TNode root, ArrayList<Integer> list){
        if (root == null) return;
        getNodes(root.left,list);
        list.add(root.data);
        getNodes(root.right,list);
    }

    public static void main(String[] args) {
        FindModeBST find = new FindModeBST();

        root = new TNode(6);
        root.left = new TNode(3);
        root.left.left = new TNode(4);
        root.left.right = new TNode(4);

        root.right = new TNode(8);
        root.right.left = new TNode(8);
        root.right.left.left = new TNode(8);

        find.findMode(root);

        for (int x: find.findMode2(root)) {
            System.out.print(x+" ");
        }
    }
}
