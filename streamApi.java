import java.util.*;
import java.util.stream.Collectors;

class StreamApi {
    public static void main(String[] args) {
        List<String> ex = Arrays.asList("hi", "hello", "hellooo", "hru");

        List<String> res = ex.stream()
            .filter(x -> x.startsWith("h"))
            .map(String::toUpperCase)
            .distinct()
            .sorted()
            .collect(Collectors.toList());

        res.forEach(System.out::println);
    }
}
