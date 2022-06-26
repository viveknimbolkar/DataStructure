package binarytree.traversal;

import predefined.TNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// TC = O(3N) We are visiting each node for three time
// SC = O(4N) We are using 3 lists and one stack
// https://www.youtube.com/watch?v=ySp2epYvgTE&list=PLgUwDviBIf0q8Hkd7bK2Bpryj2xVJk8Vk&index=14

public class InPostPreTraversal {
    TNode root;

    // a pair to add into stack
    // code constraints 1 <= code <= 3
    class Pair{
        TNode node;
        int code;
        Pair(TNode node, int code){
            this.node = node;
            this.code = code;
        }
    }

    void inPostPreTraversal(TNode root){
        if (root == null) return;
        // Temp stack to store pairs
        Stack<Pair> st = new Stack<>();
        // Three lists to store traversal result
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        // initialize traversal by adding root pair with code 1
        st.push(new Pair(root,1));

        while (!st.isEmpty()){
            Pair pair = st.pop(); // take the poped node and depending on code perform operation

            if (pair.code == 1){
                // for preorder
                pre.add(pair.node.data);
                pair.code++;
                st.push(pair);
                // find for left child nodes of current node
                if (pair.node.left != null){
                    // add the left node into stack as fresh node
                    st.push(new Pair(pair.node.left,1));
                }
            }else if (pair.code == 2){
                // for inorder
                in.add(pair.node.data);
                pair.code++;
                st.push(pair);
                if (pair.node.right != null){
                    // add the left node into stack as fresh node
                    st.push(new Pair(pair.node.right,1));
                }
            }else {
                // for pair.code == 3 i.e. postorder
                post.add(pair.node.data);
            }
        }

        System.out.println("Preorder: "+pre+"\n Inorder: "+in+"\n Postorder: "+post);
    }

    public static void main(String[] args) {
        InPostPreTraversal traversal = new InPostPreTraversal();

        traversal.root = new TNode(1);
        traversal.root.left = new TNode(2);
        traversal.root.right = new TNode(5);
        traversal.root.left.left = new TNode(3);
        traversal.root.left.right = new TNode(4);
        traversal.root.right.right = new TNode(7);
        traversal.root.right.left = new TNode(6);

        traversal.inPostPreTraversal(traversal.root);
    }
}
