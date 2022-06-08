package linkedlist.singly;
// TODO: Not working perfectly
// https://leetcode.com/problems/design-hashmap/
public class MyHashMap {
    int key, value;
    MyHashMap head, next;
    public MyHashMap(){}
    public MyHashMap(int key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public void put(int key, int value) {
        MyHashMap newNode = new MyHashMap(key,value);
        MyHashMap rootNode = head;
        if (head == null){
            head = newNode;
            return;
        }
        MyHashMap tmp = head;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        System.out.println(tmp.key);
        tmp.next = newNode;
    }

    public int get(int key) {
        MyHashMap map = head;
        while (map.next != null){
            if (map.key == key)
                return map.value;
            map = map.next;
        }
        return -1;
    }

    public void remove(int key) {
        MyHashMap temp = head, prev = null;
        while (temp.next != null && key != temp.key){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
    }

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put(1,1);
        map.put(2,2);
        map.get(1);
        map.get(3);
        map.put(2,1);
        map.get(2);
        map.remove(2);
        map.get(2);
        MyHashMap m = new MyHashMap();
        while (m != null){
            System.out.print(m.key+" "+ m.value);
            m = m.next;
        }

    }
}
