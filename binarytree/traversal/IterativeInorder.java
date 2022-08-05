package binarytree.traversal;

import predefined.TNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativeInorder {

    // Method-1: Using single stack
    List<Integer> getInorder(TNode root){
        List<Integer> inorder = new ArrayList<>();
        Stack<TNode> st = new Stack<>();
        TNode node = root;

        while (true){
            // if the left item is null then add it into the stack
            if (node != null){
                st.push(node);
                node = node.left;
            }else {
                if (st.isEmpty()) break;
                node = st.pop();
                inorder.add(node.data);
                node = node.right;
            }
        }
        return inorder;
    }

    // Method-2: Using Single Stack (sudo code available)


    TNode root;
    IterativeInorder(int data){this.root = new TNode(data);}
    IterativeInorder(){this.root = null;}
    public static void main(String[] args) {
        IterativeInorder itrIno = new IterativeInorder();
        itrIno.root = new TNode(1);
        itrIno.root.left = new TNode(2);
        itrIno.root.left.left = new TNode(4);
        itrIno.root.left.right = new TNode(5);
        itrIno.root.left.right.left = new TNode(6);
        itrIno.root.right = new TNode(3);

        for (Integer i: itrIno.getInorder(itrIno.root)) {
            System.out.print(i+" ");
        }
    }
}
