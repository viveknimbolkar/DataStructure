package linkedlist.singly;
// https://leetcode.com/problems/design-hashmap
public class MyHashMap2 {
    int[] map;
    public MyHashMap2() {
        map = new int[100000001];
    }

    public void put(int key, int value) {
        map[key] = value+1;
    }

    public int get(int key) {
        return map[key]-1;
    }

    public void remove(int key) {
        map[key] = 0;
    }
    public static void main(String[] args) {
        MyHashMap2 map = new MyHashMap2();
        map.put(1,45);
        map.put(2,23);
        map.put(3,67);
        map.put(4,34);
        map.put(5,67);
        System.out.println(map.get(3));
        System.out.println(map.get(5));
        map.remove(2);
        System.out.println(map.get(2));

    }
}
