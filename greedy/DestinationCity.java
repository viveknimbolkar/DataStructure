package greedy;
//https://leetcode.com/problems/destination-city/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity {

    String destCity(List<List<String>> paths) {
        Set<String> cities = new HashSet<>();

        for (List<String> path: paths) {
            cities.add(path.get(0));
        }

        for (List<String> path: paths) {
            String destination = path.get(1);
            if (!cities.contains(destination))
                return destination;
        }

        return "";
    }

    public static void main(String[] args){
        DestinationCity des = new DestinationCity();

        List<List<String>> cities = new ArrayList<>();

        ArrayList<String> path1 = new ArrayList<>();
        path1.add("London");
        path1.add("New York");

        ArrayList<String> path2 = new ArrayList<>();
        path1.add("New York");
        path1.add("Lima");

        ArrayList<String> path3 = new ArrayList<>();
        path1.add("Lima");
        path1.add("Sao Paulo");

        cities.add(path1);
        cities.add(path2);
        cities.add(path3);

        System.out.println(des.destCity(cities));
    }
}
