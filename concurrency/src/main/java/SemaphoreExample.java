import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SemaphoreExample {
    private static int count = 0;
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        ExecutorService executorService = Executors.newFixedThreadPool(15);

        for(int i = 0; i < 15; i++){
            executorService.execute(new MyRunnable(semaphore));
        }
        executorService.shutdown();
    }

    private static class MyRunnable implements Runnable {
        private final Semaphore semaphore;

        public MyRunnable(Semaphore semaphore){
            this.semaphore = semaphore;
        }
        @Override
        public void run() {
            try {
                semaphore.acquire(1);
                System.out.println("Permit acquired...");
                System.out.println("Processing: " + Thread.currentThread().getName());
                count++;
                System.out.println("Count: " + count);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                semaphore.release(1);
                System.out.println("Released...");
            }
        }
    }
}
