import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        List<Thread> list = new ArrayList<>();
        list.add(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1");
            }
        }));
        list.add(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2");
            }
        }));
        list.add(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 3");
            }
        }));
        list.add(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 4");
            }
        }));


        for(int i = 0; i <= 3; i++){
            executorService.submit(list.get(i));
        }
        executorService.shutdown();
    }
}
