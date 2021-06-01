import com.sun.corba.se.spi.orbutil.threadpool.Work;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concur {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(2);

        new Thread(new Waiter(latch)).start();

        new Thread(new Worker(latch)).start();
        new Thread(new Worker2(latch)).start();
    }

    static class Waiter implements Runnable{
        private final CountDownLatch latch;

        public Waiter(CountDownLatch latch){
            this.latch = latch;
        }


        @Override
        public void run() {
            try {
                System.out.println("Waiting");
                latch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Done!");
        }
    }

    static class Worker implements Runnable {
        private final CountDownLatch latch;

        public Worker(CountDownLatch latch){
            this.latch = latch;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName());
                latch.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Worker2 implements Runnable {
        private final CountDownLatch latch;

        public Worker2(CountDownLatch latch){
            this.latch = latch;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
                latch.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
