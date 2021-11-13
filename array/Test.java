package array;

import java.util.ArrayList;
class Test{

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(20);
        arrayList.add(50);
        arrayList.add(70);
        arrayList.add(80);

        System.out.println(arrayList);

        arrayList.remove(2);

        arrayList.clear();

        System.out.println(arrayList);

    }
}