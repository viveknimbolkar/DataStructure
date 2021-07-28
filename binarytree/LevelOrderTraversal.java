package binarytree;

public class LevelOrderTraversal {
    Node root; //calling From BinaryTree class

    LevelOrderTraversal(int data){
        this.root = new Node(data);
    }

    LevelOrderTraversal(){
        root = null;
    }

    //find the height of the tree using recursive function
    int height(Node root){
        //if the root nodd is null then do nothing
        if (root == null)
            return 0;
        //recursive function
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        //return the maximum height
        if (leftHeight > rightHeight)
            return( leftHeight+1);//HEIGHT STARTED FROM 1 LEVEL AND NOT FROM ROOT LEVEL
        else
            return (rightHeight+1);//HEIGHT STARTED FROM 1 LEVEL AND NOT FROM ROOT LEVEL
    }

    //print the current level nodes
    void currentLevelNodes(Node root, int level){
        if (root == null)
            return;
//        level are start from 0. the 0th level is root level. We can directly print the root node. So we are going to
//        start from 1 level. Use recursive function.
        if (level == 1)
            System.out.println(root.data);
        else if(level > 1){
            currentLevelNodes(root.left, level - 1);
            currentLevelNodes(root.right, level - 1);
        }
    }

    //print the all nodes level by level
    void levelOrderTraversal(){
        int height = height(root);
        for (int i = 1; i <= height; i++) {
            currentLevelNodes(root, i);
        }
    }

    public static void main(String[] args) {

        LevelOrderTraversal lot = new LevelOrderTraversal();
        lot.root = new Node(1);
        lot.root.left = new Node(2);
        lot.root.right = new Node(3);
        lot.root.left.left = new Node(4);
        lot.root.left.right = new Node(5);

        lot.levelOrderTraversal();
    }
}
