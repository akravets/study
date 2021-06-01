import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CycleBarrierExample {
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, () -> {
            System.out.println("All done!");
            list.stream().forEach(x -> System.out.println(x));
        });

        Thread t = new Thread(new BasePart(barrier));
        Thread t1 = new Thread(new BasePart(barrier));
        Thread t2 = new Thread(new BasePart(barrier));

        t.start();
        t1.start();
        t2.start();
    }

    private static class BasePart implements Runnable{
        private final CyclicBarrier barrier;

        public BasePart(CyclicBarrier barrier){
            this.barrier = barrier;
        }

        @Override
        public void run() {
            try {
                list.add(UUID.randomUUID().toString());
                System.out.println("Generated number");
                barrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}
