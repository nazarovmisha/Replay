package Plane;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(1,0,100,500,5);
        plane.flyStraight(50);
        plane.fillFuel();
        plane.flyUp(80, 90);
        plane.turnRight();
        plane.flyStraight(30);
        plane.dropBombs();
        plane.flyStraight(40);
        plane.flyDown(100, 10);
        plane.fillFuel();
        plane.flyDown(100, 10);
        plane.fillFuel();
    }
}
