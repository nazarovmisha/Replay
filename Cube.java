public class Cube {
    public static void main(String[] args) {
        cube(10);
    }

    public static void cube(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println("The cube of " + i + " is equal to " + i * i * i);
        }
    }
}
