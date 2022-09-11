package array.string;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/count-items-matching-a-rule/
public class ItemsMatchingRule {

    int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        for (int i = 0; i < items.size(); i++) {
            // for type
            if (ruleKey.equals("type")){
                if (items.get(i).get(0).equals(ruleValue)) count++;
            }
            // for name
            else if (ruleKey.equals("color")){
                if (items.get(i).get(1).equals(ruleValue)) count++;
            }
            // for color
            else {if (items.get(i).get(2).equals(ruleValue)) count++;}
        }
        return count;
    }

    public static void main(String[] args) {
        ItemsMatchingRule item = new ItemsMatchingRule();
        List<List<String>> items = new ArrayList<>();

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("phone");
        l1.add("blue");
        l1.add("pixel");

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("computer");
        l2.add("silver");
        l2.add("lenovo");

        ArrayList<String> l3 = new ArrayList<>();
        l2.add("phone");
        l2.add("gold");
        l2.add("iphone");

        items.add(l1);
        items.add(l2);
        items.add(l3);

        String ruleKey = "color", ruleValue = "silver";

        System.out.println("no. of matching rule: "+item.countMatches(items,ruleKey,ruleValue));
    }
}
