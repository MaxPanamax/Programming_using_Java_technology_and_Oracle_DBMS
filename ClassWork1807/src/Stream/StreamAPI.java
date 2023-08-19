package Stream;

import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        Stream.of("Argentina", "Bulgaria", "Canada", "Denmark", "Ukraine", "USA")
                .map(String::toUpperCase)
                .forEach(System.out::println);

        IntStream.of(50, 60, 70, 80, 90, 100, 110, 120)
                .filter(x -> x < 90)
                .map(x -> x + 10)
                .limit(3)
                .forEach(System.out::println);
    }
}
