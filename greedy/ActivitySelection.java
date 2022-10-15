package greedy;
//https://practice.geeksforgeeks.org/problems/activity-selection-1587115620/1

import java.util.Arrays;
import java.util.Comparator;

//define activity class
class Activity{
    int start, end;
    Activity(int start, int end){
        this.start = start;
        this.end = end;
    }
}

// comparator class to sort two arrays based on the respective order in ascending
class Compare{
     void compare(Activity[] activities, int n){
        // sort ascending on the basic of respective order
        Arrays.sort(activities, new Comparator<Activity>() {
            @Override
            public int compare(Activity o1, Activity o2) {
                return o1.end-o2.end;
            }
        });
    }
}
public class ActivitySelection {


    // greedy approach
    int activitySelectionGreedy(Activity[] activities, int n){
        // sort two arrays along with their end time in ascending order
        Compare com = new Compare();
        com.compare(activities,n);

        int i=0 , j, count = 0;

        for (j = 1; j < n; j++) {
            if (activities[j].start >= activities[i].end){
                count++;
                i = j;
            }
        }
        return count;
    }

    // brute force o(n)
    int activitySelection(int start[], int end[], int n){
        int i =0 ,j, count = 1;
        for (j = 1; j < n; j++) {
            if (start[j] >= end[i]) {
                count++;
                i = j;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ActivitySelection act = new ActivitySelection();
        int start[] = {1, 3, 2, 5};
        int end[] = {2, 4, 3, 6};

        int[] s = {2, 1};
        int[] e = {2, 2};

        Activity[] activities = new Activity[4];
        activities[0] = new Activity(1,2);
        activities[1] = new Activity(3,4);
        activities[2] = new Activity(2,3);
        activities[3] = new Activity(5,6);

        System.out.println("Max activities: "+act.activitySelectionGreedy(activities,activities.length));
    }
}
