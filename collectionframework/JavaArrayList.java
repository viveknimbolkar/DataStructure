package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(10);

        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(50);
        array.add(60);
        array.add(70);
        array.add(80);

//        System.out.println(array);
//        array.remove(1);
//        System.out.println(array);

        Iterator itr = array.iterator();

        // using while loop
//        while (itr.hasNext())
//            System.out.println(itr.next());

        //using for loop
//        for (Integer data: array) {
//            System.out.print(data+" ");
//        }

        System.out.println(array.get(4)); // get specific item

        
    }
}
