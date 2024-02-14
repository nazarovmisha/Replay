public class SOExample {
    public static void main(String[] args) {
        loop(50000);
        System.out.println("Success!");
    }

    public static void loop(int repeat) {
        if (repeat > 0) {
            loop(repeat - 1);
        }
    }
}
