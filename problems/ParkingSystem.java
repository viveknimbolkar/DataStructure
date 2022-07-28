package problems;
//https://leetcode.com/problems/design-parking-system/
public class ParkingSystem {
    int big = 0, medium = 0, small = 0;
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1 && this.big != 0){
            this.big--;
            return true;
        }else if (carType == 2 && this.medium != 0){
            this.medium--;
            return true;
        } else if (carType == 3 && this.small != 0){
            this.small--;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int big = 1, medium = 1, small = 0, carType = 1;
        ParkingSystem obj = new ParkingSystem(big, medium, small);
        boolean isCarParked = obj.addCar(carType);
        System.out.println("Car parked: "+isCarParked);
    }
}
