import java.util.*;

public class Leet225 {
    Queue<Integer> queue;
    Queue<Integer> auxQueue;
    private int top;

    public Leet225(){
        queue = new LinkedList<>();
        auxQueue = new LinkedList<>();
    }

    public void push(int x){
        queue.offer(x);
        top = x;
    }

    public int pop(){
        Integer[] objects = (Integer[]) queue.toArray();

        List<Integer> list = Arrays.asList(objects);
        int last = list.get(list.size()-1);
        list.remove(list.size()-1);

        auxQueue.addAll(list);
        queue.addAll(auxQueue);

        auxQueue.clear();

        return last;
    }

    public int top(){
        return top;
    }

    public boolean empty(){
        return queue.size() == 0;
    }

    public static void main(String[] args) {

    }
}
