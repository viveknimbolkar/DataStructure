package predefined;

public class TNode {
    public int data;
    public TNode left, right;
    public TNode(int data){
        this.data = data;
        left = right = null;
    }
    public TNode(){}

    public void inorder(TNode n){
        if (n == null) return;
        inorder(n.left);
        System.out.println(n.data);
        inorder(n.right);
    }
}
