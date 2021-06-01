import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Synch {
    public static void main(String[] args) {
        for(int i = 0; i < 50; i++){
          new Thread(r).start();
        }
    }

    //private static Semaphore s = new Semaphore(1);

    private static int num = 0;

    private static int prev = 0;


    private static void add(){
        try {
            //s.acquire();
            prev = num;
            num++;

            if(num - prev != 1){
                System.out.println("Oh-oh");
            }
            System.out.println("prev: " + prev + ", num:" + num);
        } finally {
           //s.release();
        }
    }

    static Runnable r = new Runnable() {
        @Override
        public void run() {
            add();
        }
    };
}
