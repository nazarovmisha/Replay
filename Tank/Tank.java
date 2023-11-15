package Tank;

public class Tank {

    private static final String MODEL = "T-34";
    private int positionY;
    private int positionX;
    private int fuel;
    private static int count;
    private int n;
    private static int reverse = 0;


    public Tank() {
        this(0, 0, 100);

    }

    public Tank(int positionY, int positionX) {
        this(positionY, positionX, 100);
    }

    public Tank(int positionY, int positionX, int fuel) {
        this.positionY = positionY;
        this.positionX = positionX;
        this.fuel = fuel;
        n = ++count;
    }


    public void goForward(int x) {

        if (fuel > x) {
            fuel -= x;
        } else x = fuel;
        fuel = 0;
        if (reverse == 0) {
            positionY += x;
        } else if (reverse == 1) {
            positionX += x;
        } else if (positionX == 3) {
            positionY -= x;
        } else positionY -= x;
    }

    public void printPosition() {
        System.out.println("The Tank" + MODEL + "-" + n + " is at " + positionY + "," + positionX + " now.");
    }

    public void goBackward(int x) {
        x = Math.abs(x);
        goForward(-x);
    }


    public static void turnRight() {
        reverse += 1;
        if (reverse == 4) {
            reverse = 0;
        }
        if (reverse == -1) {
            reverse = 3;
        }
    }

    public static void turnLeft() {
        reverse -= 1;
        if (reverse == 4) {
            reverse = 0;
        }
        if (reverse == -1) {
            reverse = 3;
        }
    }

    public int getPositionY() {
        return positionY;
    }

    public Tank setPositionY(int positionY) {
        this.positionY = positionY;
        return this;
    }

    public int getPositionX() {
        return positionX;
    }

    public Tank setPositionX(int positionX) {
        this.positionX = positionX;
        return this;
    }

    public int getFuel() {
        return fuel;
    }

    public Tank setFuel(int fuel) {
        this.fuel = fuel;
        return this;
    }
}
