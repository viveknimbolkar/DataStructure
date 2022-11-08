package array.matrix;

import java.util.ArrayList;

//https://leetcode.com/problems/number-of-laser-beams-in-a-bank/
public class NumberOfLaserBeamsInABank {

    int numberOfBeams(String[] bank) {
        ArrayList<Integer> laser = new ArrayList<>();

        // get each row
        for (String str : bank) {
            // get the count of lasers and store into laser list
            int count = 0;
            for (int i = 0; i < str.length(); i++)
                if (str.charAt(i) == '1') count++;
            if (count == 0) continue;
            laser.add(count);
        }
        System.out.println(laser);

        //get the laser beams
        int totalLaserBeams = 0;
        for (int i = 0; i < laser.size()-1; i++) {
            totalLaserBeams += laser.get(i) * laser.get(i+1);
        }
        return totalLaserBeams;
    }

    public static void main(String[] args) {
        NumberOfLaserBeamsInABank numlat = new NumberOfLaserBeamsInABank();
        String[] bank = {"011001","000000","010100","001000"};
        String[] bank2 = {"1","1"};
        System.out.println("Total laser beams: "+numlat.numberOfBeams(bank2));
    }
}
