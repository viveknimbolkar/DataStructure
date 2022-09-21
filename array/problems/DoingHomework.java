package array.problems;
//https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/
public class DoingHomework {

    int busyStudent(int[] startTime, int[] endTime, int queryTime){
        if (startTime.length != endTime.length) return -1;
        int count = 0;

        for (int i = 0; i < startTime.length; i++)
            if ((queryTime >= startTime[i] && queryTime <= endTime[i]))
                count++;

        return count;
    }

    public static void main(String[] args) {
        DoingHomework doho = new DoingHomework();
        int[] startTime = {1,2,3}, endTime = {3,2,7};
        int queryTime = 4;

        System.out.println("Total student: "+doho.busyStudent(startTime,endTime,queryTime));
    }
}
