import java.util.*;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main(String[] args) {
        String string = "big black bug bit a big black dog on his big black nose";
        List<String> collect = Arrays.asList(string.split(" ")).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .map(x -> x.getKey())
                .collect(Collectors.toList());

        Map<String, Set<String>> collect1 = Arrays.asList(string.split(" ")).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.mapping(s -> s + "x", Collectors.toSet())));

        System.out.println(collect);
    }
}
