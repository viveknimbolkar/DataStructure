package array.problems;


import java.util.Arrays;

public class LargestName {

    public static void main(String[] args) {
        String[] names = {"vivek", "viveknamdeo","viveknamdeonimbolkar","nimbolkar","namdeo"};
        int[] lengths = new int[names.length];
        String result = "";
        for (int i = 0; i < names.length; i++) {
            lengths[i] = names[i].length();
        }

        Arrays.sort(lengths);
        System.out.println(lengths[lengths.length -1]);

        for (String data: names) {
            if (data.length() == lengths[lengths.length -1])
                result = data;
        }
        System.out.println(result);


    }
}
