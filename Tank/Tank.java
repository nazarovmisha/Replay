package Tank;

public class Tank {

    static int positionX = 0;
    static int positionY = 0;
    static int reverse = 0;


    public static void goForward(int x) {

        if (reverse == 0) {
            positionY += x;
        } else if (reverse == 1) {
            positionX += x;
        } else if (positionX == 3) {
            positionY -= x;
        } else positionY -= x;
    }

    public static void printPosition() {
        System.out.println("The Tank is at " + positionY + "," + positionX + " now.");
    }

    public static void goBackward(int x) {
        if (reverse == 0) {
            positionY -= x;
        } else if (reverse == 1) {
            positionX -= x;
        } else if (positionX == 3) {
            positionY += x;
        } else positionY += x;
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

}
