import lombok.Value;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    static Logger logger = LoggerFactory.getLogger(Streams.class);

    public static void main(String[] args) {
        Item[] items = new Item[]{
          new Item("car", 123.00),
          new Item("bus", 54.00)
        };


        Map<String, Set<Double>> collect = Stream.of(items).collect(
                Collectors.groupingBy(Item::getName,
                        Collectors.mapping(
                                Item::getPrice, Collectors.toSet())
                ));

        System.out.println(collect);

        List<Item> itemsList = Arrays.asList(items);
        System.out.println(itemsList);
        Comparator<Item> comparatorPrice = (x,y) -> x.getPrice().compareTo(y.getPrice());
        Collections.sort(itemsList,comparatorPrice);
        System.out.println(itemsList);
    }

    @Value
    private static class Item{
        String name;
        Double price;
    }
}
