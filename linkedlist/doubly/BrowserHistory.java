package linkedlist.doubly;

//https://leetcode.com/problems/design-browser-history/

// doubally linked list
class DoubleNode{
    String url;
    DoubleNode next, prev;

    // initialize the head with homapge
    public DoubleNode(String homepage){
        this.url = homepage;
        this.next = this.prev = null;
    }
}

public class BrowserHistory {

    DoubleNode head; // create a homepage
    public BrowserHistory(String homepage) {
       DoubleNode newnode = new DoubleNode(homepage);
        this.head = newnode;
    }

    public void visit(String url) {
        DoubleNode newnode = new DoubleNode(url); // create a new node
        newnode.prev = this.head; // point the previous of the newnode to the head node;
        this.head.next = newnode; // point the next of head to the newnode
        this.head = this.head.next; // move pointer forward
    }

    public String back(int steps) {
        // go until steps == 0
        while(this.head.prev != null && steps-- > 0){
            this.head = this.head.prev;
        }
        return this.head.url;
    }

    public String forward(int steps) {
        while (this.head.next != null && steps --> 0){
            this.head = this.head.next;
        }
        return this.head.url;
    }

    public static void main(String[] args) {
        String homepage = "https;///www.google.com";
        String url = "https://www.facebook.com";
        BrowserHistory browser = new BrowserHistory(homepage);
        browser.visit(url);
        String param_2 = browser.back(1);
        String param_3 = browser.forward(2);

    }
}
