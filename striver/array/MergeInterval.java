package striver.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeInterval {
    // BRUTE FORCE: By Storing intervals into list
    public List<List<Integer>> mergeOverlappingInterval(int[][] intervals){
        int n = intervals.length;

        // Sort the intervals in ascending order
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int startI = intervals[i][0];
            int endI = intervals[i][1];
            System.out.println(ans.size());
            int lastEle = ans.get(ans.size()-1).get(1);

            // skip all merge intervals
            if(!ans.isEmpty() && endI <= lastEle)
                continue;

            // check rest intervals
            for (int j = i+1; j < n; j++) {
                if(intervals[j][0] <= endI)
                    endI = Math.max(endI,intervals[j][1]);
                else break;
            }

            ans.add(Arrays.asList(startI,endI));
        }

        return ans;

    }

    public List<List<Integer>> mergeOverlapping(int[][] intervals){
        int n = intervals.length;

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        for (int i = 0; i < n; i++) {
            // if interval does not lies in last interval
            if(ans.isEmpty() || intervals[i][0] > ans.get(ans.size()-1).get(1)){
                ans.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            }
            // if interval lies in last interval
            else{
                int lastIntervalIndex = ans.size() - 1;
                int max = Math.max(ans.get(lastIntervalIndex).get(1), intervals[i][1]);
                ans.get(lastIntervalIndex).set(1,max);
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        MergeInterval mi = new MergeInterval();
        int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};
        System.out.println(mi.mergeOverlapping(intervals));

    }
}
