public class Signal {
    public static void signal(double time) {
     time%=5;
        if (0<time&&time < 3) {
            System.out.println("green");
        } else if (3 <= time && time < 4) {
            System.out.println("yellow");
        } else {
            System.out.println("red");
        }
    }


    public static void main(String[] args) {
        signal(21);
    }
}
