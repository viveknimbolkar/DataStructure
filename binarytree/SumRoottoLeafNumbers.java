package binarytree;

import predefined.TNode;

//https://leetcode.com/problems/sum-root-to-leaf-numbers/
//https://www.youtube.com/watch?v=Gi0202QawRQ
public class SumRoottoLeafNumbers {
    static TNode root;
    int ans = 0;
    int sumNumbers(TNode root) {
        if (root == null) return 0;
        dfs(root,0);
        return ans;
    }

    // carry the value along with dfs algo
    void dfs(TNode root, int val){
        if (root == null) return;

        // base10 system so left shift every val by 1
        val *= 10;
        val += root.data; // add the current node into pervious node values

        // if the current node the leaf node then add it into the answer
        if (root.left == null && root.right == null){
            ans += val;
            return;
        }
        dfs(root.left,val);
        dfs(root.right,val);
    }

    public static void main(String[] args) {
        SumRoottoLeafNumbers sum = new SumRoottoLeafNumbers();

        root = new TNode(4);
        root.left = new TNode(9);
        root.left.right = new TNode(1);
        root.left.left = new TNode(5);
        root.right = new TNode(0);

        System.out.println(sum.sumNumbers(root));
    }
}
