public class Sync {
    private static int num =  0;
    private static Integer lock = new Integer(1);

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                add();
            }
        };

        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }

    private static void add(){
        synchronized (lock){
            num++;
        }
        System.out.println(num);
    }
}
