import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArraysSumm {
    public static void main(String[] args) {
        arrayMultiply();
        streamMultiply();
    }

    public static void arrayMultiply() {
        List<String> listStrings = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> integerList = new ArrayList<>();
        for (String s : listStrings) {
            integerList.add(Integer.valueOf(s));
        }
        int myl = 1;
        for (Integer i : integerList) {
            myl *= i;
        }
        System.out.println(myl);
    }

    public static void streamMultiply() {
       int multiply = Stream.of("1", "2", "3", "4", "5")
                .map(Integer::parseInt)
                .reduce( 1,((integer, integer2) -> integer * integer2));
        System.out.println(multiply);
    }
}
