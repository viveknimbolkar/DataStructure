package array.problems;
//https://www.codingninjas.com/studio/problems/traffic_6682625?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
public class Traffic {

    int traffic(int[] vehicle, int n, int m) {
        // place m times 1 in the place of 0
        for (int i = 0; i < n; i++) {
            if(m > 0 && vehicle[i] == 0){
                vehicle[i] = 1;
                m--;
            }
        }
        // count max ones
        int count = 0, max = 0;
        for (int i = 0; i < n; i++) {
            if(vehicle[i] == 1){
                count++;
            }else{
                count = 0;
            }
            max = Math.max(max,count);
        }
        return max;
    }

    public static void main(String[] args) {
        Traffic t = new Traffic();
//        int[] vehicle = {0,1,0,0,1,0};
//        int n = 6, m = 3;
        int[] vehicle = {0,1,1};
        int n = 3, m = 1;
        System.out.println(t.traffic(vehicle,n,m));
    }
}
