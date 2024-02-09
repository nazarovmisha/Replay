import java.util.*;

import java.util.ArrayList;
import java.util.stream.Stream;

public class HomeStream {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(117d, 12.2d, 66d, 18.5d);
        List<String> list2 = Arrays.asList("15", "18.5", "117", "22.2");
        List<Double> doubles = new ArrayList<>();
        for (String s : list2) {
            doubles.add(Double.valueOf(s));
        }
        Set<Double> sortedDoubles = new TreeSet<>(Comparator.reverseOrder());
        sortedDoubles.addAll(list);
        sortedDoubles.addAll(doubles);
        for (double d : sortedDoubles) {
            System.out.println(d);
        }
            List<Double> list3 = Arrays.asList(117d, 12.2d, 66d, 18.5d);
            List<String> list4 = Arrays.asList("15", "18.5", "117", "22.2");
            Stream.concat(
                            list3.stream(),
                            list4.stream()
                                    .map(Double::valueOf))
                    .distinct()
                    .sorted(Comparator.reverseOrder())
                    .forEach(System.out::println);

    }
}
