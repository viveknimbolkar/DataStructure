import predefined.TNode;

import java.util.Stack;

class Temp {
    TNode root;
    Temp(int data){this.root = new TNode(data);}
    Temp(){};

    int height(TNode node){
        if (node == null) return 0;
        int left = height(node.left);
        int right = height(node.right);

        if (left > right) return left+1;
        return right+1;
    }

    void printCurrLevel(TNode n,int l){
        if (n == null)return;
        if (l ==1)
            System.out.println(n.data);
        else {
            printCurrLevel(n.left,l-1);
            printCurrLevel(n.right,l+1);
        }
    }

    void levelOrder(TNode n){
        int h = height(n);
        printCurrLevel(n,h);
    }
    public static void main(String[] args) {
        Temp t = new Temp();
        t.root = new TNode(1);
        t.root.left = new TNode(2);
        t.root.right = new TNode(3);
        t.root.left.left = new TNode(4);
        t.root.left.right = new TNode(5);
        t.root.left.right.left = new TNode(7);
        t.root.left.right.right = new TNode(8);
        t.root.left.right.right.right = new TNode(9);
        t.root.right.right = new TNode(6);

        t.levelOrder(t.root);

    }
}