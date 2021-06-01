import sun.awt.image.ImageWatched;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedL {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        Iterator<Integer> integerIterator = linkedList.descendingIterator();

        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }
    }
}
