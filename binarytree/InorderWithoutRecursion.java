package binarytree;
// O(n)
import java.util.Stack;

public class InorderWithoutRecursion {
    Node root;

    void inorderTraversalWithoutRecursion(){
        if (root == null) return;
        //store current node in stack DS
        Stack<Node> stack = new Stack<>();
        Node currentNode = root;
        //traverse the stack ds
        while (currentNode != null || stack.size() > 0){
            //reach out the left most node
            while (currentNode != null){
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = stack.pop(); // last node should be null
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.right; // go to the right child node
        }
    }

    public static void main(String[] args) {
        InorderWithoutRecursion iwr = new InorderWithoutRecursion();
        iwr.root = new Node(1);
        iwr.root.left = new Node(2);
        iwr.root.right = new Node(3);
        iwr.root.left.left = new Node(4);
        iwr.root.left.right = new Node(5);

        iwr.inorderTraversalWithoutRecursion();

    }
}
