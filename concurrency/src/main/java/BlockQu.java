import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class BlockQu {
    public static void main(String[] args) {
        BlockingQueue<String> s = new ArrayBlockingQueue<String>(20);

        Thread t = new Thread(new Producer(s));
        t.start();

        Thread t2 = new Thread(new Consumer(s));
        t2.start();

    }

    static class Producer implements Runnable {
        private final BlockingQueue q;

        public Producer(BlockingQueue q){
            this.q = q;
        }

        @Override
        public void run() {
            try {
                q.add("1");
                Thread.sleep(100);
                q.add("2");
                Thread.sleep(100);
                q.add("3");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Consumer implements Runnable {
        private final BlockingQueue q;

        public Consumer(BlockingQueue q){
            this.q = q;
        }

        @Override
        public void run() {
            try {
                System.out.println(q.take());
                System.out.println(q.take());
                System.out.println(q.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
