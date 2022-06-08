
public class Dummy {
    Dummy head, next;
    int data;

    public Dummy(int d) {
        this.data = d;
        this.next = null;
    }
    Dummy(){}

    public int get(int index) {
        Dummy temp = head;
        while(temp != null && index > 0){
            temp = temp.next;
            index--;
        }
        return temp.data;
    }

    public void addAtHead(int val) {

    }

    public void addAtTail(int val) {

    }

    public void addAtIndex(int index, int val) {

    }

    public void deleteAtIndex(int index) {

    }
    public static void main(String[] args) {
        Dummy d = new Dummy();

    }
}
