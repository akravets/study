import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class ImmutableObject {
    private final String name;
    private final ArrayList<String> list;

    public ImmutableObject(String name, ArrayList<String> list) {
        this.name = name;

        ArrayList<String> tmp = new ArrayList<>();

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            tmp.add(iterator.next());
        }

        this.list = tmp;
    }

    public ArrayList getList() {
        return (ArrayList) list.clone();
    }

    public static void main(String[] args) {
        ImmutableObject io = new ImmutableObject("bob", new ArrayList<>(Arrays.asList("bob", "jake")));

        System.out.println(io.getList());
        io.getList().add("bobbb");
        System.out.println(io.getList());

    }
}
