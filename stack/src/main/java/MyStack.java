import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MyStack<E> {
    List<E> list = new ArrayList<E>();

    public boolean empty(){
        return list.size() == 0;
    }

    public E peek(){
        E e = list.get(list.size() - 1);
        return e;
    }

    public E pop(){
        E e = list.get(list.size() - 1);
        list.remove(e);
        return e;
    }

    public void push(E e){
        list.add(e);
    }

    public int search(Object o){
        int i = 0;
        for(Object obj : list){
            if(o.equals(obj)){
                return i;
            }
            i++;
        }
        return -1;
    }

    public int size() {
        return list.size();
    }
}
