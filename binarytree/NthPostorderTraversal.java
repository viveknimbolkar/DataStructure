package binarytree;
// https://www.geeksforgeeks.org/binary-tree-data-structure/
public class NthPostorderTraversal {
    static int count = 0;
    Node root;

    static void getNthNode(Node node, int n){
        if (node == null) return;
        if (count <= n){
            getNthNode(node.left,n);
            getNthNode(node.right,n);
            count++;
            if (count == n) {
                System.out.println("\n"+n+" node is :"+node.data);
            }
        }
    }

    static void postOrderTraversal(Node node){
        if (node == null) return;
        postOrderTraversal(node.right);
        System.out.print(node.data+" ");
        postOrderTraversal(node.left);
    }

    public static void main(String[] args) {
        NthPostorderTraversal npt = new NthPostorderTraversal();
        npt.root = new Node(10);
        npt.root.left = new Node(20);
        npt.root.left.left = new Node(30);
        npt.root.left.right = new Node(40);
        npt.root.right = new Node(50);
        npt.root.right.left = new Node(60);

        npt.postOrderTraversal(npt.root);
        npt.getNthNode(npt.root,3);
    }
}
