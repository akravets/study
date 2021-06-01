import java.util.concurrent.*;

public class FutureEx {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> submit = executorService.submit(new MyCallable());
            try {
                String s = submit.get();
                System.out.println(s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            finally {
                executorService.shutdownNow();
            }
    }

    private static class MyCallable implements Callable<String> {

        @Override
        public String call() throws Exception {
            Thread.sleep(11000);
            return "jello";
        }
    }
}
