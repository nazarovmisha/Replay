import java.util.Arrays;
import java.util.List;

public class ArrayStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int sum = list.stream().map((x) -> x * x).reduce(Integer::sum).get();
        System.out.println(sum);
    }
}

