package binarytree;
// https://practice.geeksforgeeks.org/problems/minimum-element-in-bst/1/
import predefined.TNode;

public class GetMinElement {
    TNode root;

    int minValue(TNode node) {
        TNode temp = node;
        while (temp.left != null)
            temp = temp.left;

        return temp.data;
    }

    public static void main(String[] args) {
        GetMinElement getMin = new GetMinElement();
        getMin.root = new TNode(5);
        getMin.root.left = new TNode(4);
        getMin.root.left.left = new TNode(3);
        getMin.root.left.left.left = new TNode(1);
        getMin.root.right = new TNode(6);
        getMin.root.right.right = new TNode(7);

        System.out.println("min element is: "+getMin.minValue(getMin.root));
    }
}
