import java.util.*;

public class Collection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add(null);

        Iterator<String> iterator = list.iterator();

        System.out.println("list");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        HashMap<String, String> hm = new HashMap<>();
        hm.put(null, "");
        hm.put("dd","ff");
        System.out.println();

        Iterator<String> set = hm.keySet().iterator();

        System.out.println("map");
        while(set.hasNext()){
            String next = set.next();
            System.out.println(hm.get(next));
        }
    }
}
