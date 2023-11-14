package Tank;

public class Tank {

    static int position = 0;

    public static void goForward(int x) {
        position += x;
    }

    public static void printPosition() {
        System.out.println("The Tank is at " + position + " now.");
    }

    public static void goBackward(int x) {
         position -= x;
    }
}
