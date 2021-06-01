package maps;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Socks {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};

        int pairs = 0;

        Integer[] intArr = Arrays.stream(arr).boxed().toArray( Integer[]::new );

        int sum = Arrays.stream(intArr).collect(
                Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                )
        ).values().stream().mapToInt(i -> i.intValue() / 2).sum();
    }
}
