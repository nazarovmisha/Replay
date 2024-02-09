import java.util.stream.IntStream;

public class HomeWorkStream {
    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1,100);
        int summ = stream
                .limit(100)
                .skip(50)
                .filter(s->s%2==0||s%5==0)
                .sum();
        System.out.println(summ);
    }
}
