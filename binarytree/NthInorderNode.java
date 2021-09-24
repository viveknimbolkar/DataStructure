package binarytree;
// O(n)
// https://www.geeksforgeeks.org/find-n-th-node-inorder-traversal/
public class NthInorderNode {
    Node root;
    int count = 0;
    void getNthNode(Node node, int n){
        if (node == null) return;
        if (count <= n){
            getNthNode(node.left, n);
            count++;
            if (count == n)
                System.out.println(node.data);
            getNthNode(node.right,n);
        }
    }

    void inorderTraversal(Node node){
        if (node == null) return;
        inorderTraversal(node.left);
        System.out.print(node.data+" ");
        inorderTraversal(node.right);
    }

    public static void main(String[] args) {
        NthInorderNode nin = new NthInorderNode();
        nin.root = new Node(10);
        nin.root.left = new Node(20);
        nin.root.left.left = new Node(30);
        nin.root.left.right = new Node(40);
        nin.root.left.right.left = new Node(50);
        nin.root.left.right.right = new Node(60);
        nin.root.right = new Node(70);
        nin.root.right.left = new Node(80);
        nin.root.right.right = new Node(90);

        nin.inorderTraversal(nin.root);
        nin.getNthNode(nin.root, 3);
    }
}
