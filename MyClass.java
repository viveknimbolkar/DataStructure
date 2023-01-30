
import predefined.TNode;

import java.util.ArrayList;
import java.util.Stack;

class MyClass{

    public static void main(String[] args) {
        TNode root = new TNode(1);
        root.left = new TNode(2);
        root.right = new TNode(3);
        root.left.left = new TNode(4);
        root.left.right = new TNode(5);

        inorder(root);
    }

    private static void inorder(TNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<TNode> st1 = new Stack<>();
        Stack<TNode> st2 = new Stack<>();
        st1.push(root);
        TNode curr = root;
        while (!st1.isEmpty()){
           curr = st1.pop();
           st2.push(curr);
           if (curr.left != null) st1.push(curr.left);
           if (curr.right != null) st1.push(curr.right);
        }
        while (!st2.isEmpty()){
            ans.add(st2.pop().data);
        }
        System.out.println(ans);
    }


}