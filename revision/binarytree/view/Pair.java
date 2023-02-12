package revision.binarytree.view;

import predefined.TNode;

public class Pair {
    int level;
    TNode node;
    Pair(TNode node,int level){
        this.level = level;
        this.node = node;
    }
}
