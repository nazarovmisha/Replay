import java.util.Optional;
import java.util.Random;

public class OptionalRandom {
    public static void main(String[] args) {
        System.out.println(equally(1));
    }

    public static Optional<String> equally(int guess) {
        int number = new Random().nextInt(5)+1;
        System.out.println("number: " +number);
        if (guess>=1&&guess<=5){
            if (guess==number){
                return Optional.of("Поздравляем! Верное значение");
            }else {
                return Optional.empty();
            }

        }throw new  IllegalStateException();
    }
}
