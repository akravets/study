package maps;

import java.util.EnumSet;
import java.util.stream.Collectors;

public class EnumMapExample {
    private static enum myEnum{
        One("one"),
        Two("two");

        private final String name;

        myEnum(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
    public static void main(String[] args) {
        EnumSet<myEnum> set = EnumSet.allOf(myEnum.class);
        String collect = set.stream().map(s -> s.getName()).collect(Collectors.joining(","));
        System.out.println();
    }
}
