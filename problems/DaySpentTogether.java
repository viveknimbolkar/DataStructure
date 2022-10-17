package problems;

import java.time.LocalDate;

//https://leetcode.com/problems/count-days-spent-together/
public class DaySpentTogether {

    int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        LocalDate date1 = LocalDate.of(2021,Integer.parseInt(arriveAlice.substring(0,2)),Integer.parseInt(arriveAlice.substring(3,5)));
        LocalDate date2 = LocalDate.of(2021,Integer.parseInt(leaveAlice.substring(0,2)),Integer.parseInt(leaveAlice.substring(3,5)));
        LocalDate date3 = LocalDate.of(2021,Integer.parseInt(arriveBob.substring(0,2)),Integer.parseInt(arriveBob.substring(3,5)));
        LocalDate date4 = LocalDate.of(2021,Integer.parseInt(leaveBob.substring(0,2)),Integer.parseInt(leaveBob.substring(3,5)));

        long aliceArrived = date1.toEpochDay();
        long aliceLeave = date2.toEpochDay();
        long bobArrived = date3.toEpochDay();
        long bobLeave = date4.toEpochDay();

        if (aliceLeave < bobArrived || bobLeave < aliceArrived) return 0;

        return (int) (Math.min(aliceLeave,bobLeave)-Math.max(aliceArrived,bobArrived)+1);
    }

    public static void main(String[] args) {
        DaySpentTogether day = new DaySpentTogether();
        String arriveAlice = "08-15", leaveAlice = "08-18", arriveBob = "08-16", leaveBob = "08-19";
        System.out.println("Day spent together: "+day.countDaysTogether(arriveAlice,leaveAlice,arriveBob,leaveBob));
    }
}
