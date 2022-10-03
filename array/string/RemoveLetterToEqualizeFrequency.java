package array.string;

import javax.print.attribute.standard.Chromaticity;
import java.util.*;

public class RemoveLetterToEqualizeFrequency {
    boolean equalFrequency(String word) {
        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (map.containsKey(ch))
                map.put(ch,map.get(ch)+1);
            else map.put(ch,1);
        }

        int i = 0;
        int[] list = new int[map.size()];
        for (Map.Entry<Character,Integer> entry: map.entrySet()) {
            list[i++] = entry.getValue();
        }
        Arrays.sort(list);
        if (list[list.length-1] > list[list.length-2])
            list[list.length-1] = list[list.length-1]-1;

        for (int j = 0; j <= list.length-1; j++) {
            if (list[j+1] > list[j]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        RemoveLetterToEqualizeFrequency rem = new RemoveLetterToEqualizeFrequency();
        String word = "aabb";
        System.out.println(rem.equalFrequency(word));

    }
}
