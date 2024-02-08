
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsStream {
    public static void main(String[] args) {


        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        String result = ohMy.collect(Collectors.joining(", "));
        System.out.println(result);

        Stream<String> oh = Stream.of("lions", "tigers", "bears");
        Double res = oh.collect(Collectors.averagingInt(String::length));
        System.out.println(res);

        Stream<String> o = Stream.of("lions", "tigers", "bears");
        TreeSet<String> resultTree = o.filter(s -> s.startsWith("t"))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(resultTree);

        Stream<String> omg = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> map = omg.collect(Collectors.toMap(s -> s, String::length));
        System.out.println(map);

        Stream<String> om = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> stringMap = om.collect(Collectors.toMap(String::length, k -> k,
                (s1, s2) -> s1 + " " + s2));
        System.out.println(stringMap.getClass());
        System.out.println(stringMap);

        Stream<String> mmm = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> listMap = mmm.collect(Collectors.groupingBy(String::length));
        System.out.println(listMap);

        Stream<String> animals = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> integerListMap = animals.collect(
                Collectors.partitioningBy(s -> s.length() <= 5));
        System.out.println(integerListMap);

    }
}
