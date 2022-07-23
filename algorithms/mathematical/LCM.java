package algorithms.mathematical;

public class LCM {
    int findLCM(int a,int b){
        int c = (a>b)?a:b; // find the the smallest element
        for (int i = c; i < a*b; i++)
            //check if it is divisible by both number
            if (i%a==0 && i%b==0)
                return i;
        return -1;
    }


    public static void main(String[] args) {
        LCM lcm = new LCM();
        int a = 10;
        int b = 4;

        System.out.println(lcm.findLCM(a,b));
    }
}
