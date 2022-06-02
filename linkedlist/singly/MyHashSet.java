package linkedlist.singly;
public class MyHashSet {
    MyHashSet head;
    int val;
    MyHashSet next;

    public MyHashSet() {}
    public MyHashSet(int val) {
        this.val = val;
        this.next = null;
    }

    public void add(int key) {
        MyHashSet newNode = new MyHashSet(key);
        if (head == null){
            head = newNode;
            return;
        }
//        newNode.next = null;
        MyHashSet temp = head;
        while(temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }


    public void remove(int key) {
        MyHashSet  temp = head, prev = null;
        if (temp != null && temp.val == key){
            head = temp.next;
            return;
        }
        while (temp != null && temp.val != key){
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return;
        prev.next = temp.next;
    }

    public boolean contains(int key) {
        MyHashSet temp = head;
        while(temp != null)
            if(temp.val == key) return true;
        return false;
    }

    public static void main(String[] args) {
        MyHashSet obj = new MyHashSet();
        int key = 5;
        obj.add(2);
        obj.add(3);
        obj.add(5);
//        obj.remove(key);
        boolean param_3 = obj.contains(key);

        MyHashSet temp = obj.head;
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }

    }
}
