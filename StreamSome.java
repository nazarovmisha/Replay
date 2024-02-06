import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamSome {
    public static void main(String[] args) {
        Stream<String> empty = Stream.empty();
        Stream<Integer> single = Stream.of(1);
        Stream<Integer> any = Stream.of(1, 2, 3);
        Stream<Integer> some = Arrays.stream(new Integer[]{1, 2, 3});
        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);


        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
        List<String> list = Arrays.asList("monkey", "2", "chimp");
        Stream<String> inf = Stream.generate(() -> "Chimp");
        System.out.println(list.stream().anyMatch(pred));
        System.out.println(list.stream().allMatch(pred));
        System.out.println(list.stream().noneMatch(pred));
        System.out.println(inf.anyMatch(pred));

        Stream<String> s = Stream.of("monkey", "ape", "bonobo");
        System.out.println(s.count());


        Stream<String> st = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = st.min(Comparator.comparingInt(String::length));
        min.ifPresent(System.out::println);

        Stream<String> stream = Stream.of("monkey", "ape", "bonobo");
        Stream<String> infin = Stream.generate(() -> "chimp");
        stream.findAny().ifPresent(System.out::println);
        infin.findAny().ifPresent(System.out::println);

        Stream<String> printable = Stream.of("monkey", "ape", "bonobo");
        printable.forEach(System.out::print);
        System.out.println();

        Stream<String>streamString = Stream.of("w","o","l","f");
        String word =streamString.reduce("",(b,c)->b+c);
        System.out.println(word);

        Stream<String> collStream = Stream.of("w","o","l","f");

        StringBuilder stringBuilder = collStream.collect(StringBuilder::new,StringBuilder::append,StringBuilder::append);
        String wolf = stringBuilder.toString();
        System.out.println(wolf);
    }
}

