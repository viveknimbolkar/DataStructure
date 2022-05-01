package binarytree;

import predefined.TNode;
// https://practice.geeksforgeeks.org/problems/construct-tree-1/1/#
public class ConstructBTFromInorderAndPreorder {

    static int preIdx = 0;

    TNode buildTree(char[] in, char[] pre, int stIndex, int endIndex){
        if (stIndex > endIndex) return null;
        TNode node = new TNode(pre[preIdx++]);
        if (stIndex == endIndex) return node;
        //find the index of root node in inorder array
        int index = search(in,stIndex,endIndex,node.data);
        // build left subtree
        node.left = buildTree(in,pre,stIndex,index-1);
        // build right subtree
        node.right = buildTree(in,pre,index+1,endIndex);
        return node;
    }

    int search(char[] in, int start, int end, int value){
        int i;
        for (i = start; i <= end; i++)
            if (in[i] == value) return i;
        return i;
    }

    // it is printing the unicode of the characters
    public static void main(String[] args) {
        char[] in = {'D','B','E','A','F','C'};
        char[] pre = {'A','B','D','E','C','F'};
        TNode n = new TNode();
        ConstructBTFromInorderAndPreorder construct = new ConstructBTFromInorderAndPreorder();
        n.inorder(construct.buildTree(in,pre,0,in.length-1));

    }
}
