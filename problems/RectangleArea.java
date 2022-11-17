package problems;
//https://leetcode.com/problems/rectangle-area/
public class RectangleArea {

    int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        long areaOfFirstRectangle = ((long)(ax2-ax1)) * ((long)(ay2-ay1));
        long areaOfSecondRectangle = ((long)(bx2-bx1)) * ((long)(by2-by1));
        long overlappedArea = Math.max((long)Math.min(ax2,bx2)-(long)Math.max(ax1,bx1) ,0)
                            * Math.max((long)Math.min(ay2,by2)-(long)Math.max(ay1,by1),0);

        // total area excluding overlapped area
        return (int)(areaOfFirstRectangle + areaOfSecondRectangle - overlappedArea);
    }

    public static void main(String[] args) {
        RectangleArea rec = new RectangleArea();
        int ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2;
        System.out.println(rec.computeArea(ax1,ay1,ax2,ay2,bx1,by1,bx2,by2));
    }
}
