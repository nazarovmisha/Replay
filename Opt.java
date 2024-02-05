import java.util.Optional;

public class Opt {
    public static void main(String[] args) {

        System.out.println(average(4,3,4,1,5,5));
        System.out.println(average());
    }

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) {
            return Optional.empty();
        }
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return Optional.of((double) sum / scores.length);
    }
}
