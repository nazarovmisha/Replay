import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Stream2 {
    public static void main(String[] args) {
        Stream<String>s=Stream.of("monkey","ape","bonobo");
        s.filter(a->a.startsWith("m")).forEach(System.out::println);

        Stream<String> stream = Stream.of("duck","duck","duck","goose", "goose");
        stream.distinct().forEach(System.out::println);

        Stream<Integer> str = Stream.iterate(1,n->n+1);
        str.skip(5).limit(2).forEach(System.out::println);


        Stream<String> stream1 = Stream.of("monkey", "ape", "bonobo");
        stream1.map(String::length).forEach(System.out::println);

        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("bonobo");
        List<String> two = Arrays.asList("mama gorilla", "baby gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);
        Stream<String> stream2 = animals.flatMap(list->list.stream());
        stream2.forEach(System.out::print);

        Stream<String> stringStream = Stream.of("bear-","brown-");
        stringStream.sorted().forEach(System.out::println);

        Stream<String> stream3 = Stream.of("brown bear-","grizzly");
        stream3.sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
}
