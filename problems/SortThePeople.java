package problems;
//https://leetcode.com/contest/weekly-contest-312/problems/sort-the-people/
import java.util.*;

public class SortThePeople {

    String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map = new HashMap<>();

        for (int i = 0; i < heights.length; i++) {
            if (map.containsKey(heights[i])){
                map.put(heights[i]+1,names[i]);
            }else{
                map.put(heights[i],names[i]);
            }
        }

//        System.out.println(map);
        TreeMap<Integer,String> tm =new  TreeMap<Integer,String> (map);
        System.out.println(tm);

        ArrayList<String> ans = new ArrayList<>();
        for (Map.Entry<Integer,String> entry: tm.entrySet()) {
            ans.add(entry.getValue());
        }

        System.out.println(ans);

        String[] sortedPeople = new String[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            sortedPeople[i] = ans.get(ans.size()-i-1);
        }
        return sortedPeople;
    }

    public static void main(String[] args) {
        SortThePeople sort = new SortThePeople();
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};

        for (String s: sort.sortPeople(names,heights)) {
            System.out.print(s+" ");
        }
    }
}
