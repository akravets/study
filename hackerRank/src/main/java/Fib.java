public class Fib {
    public static void main(String[] args) {
        int x = fib(5);
        System.out.println(x);
    }

    private static int fib(int n){
        if(n <= 1){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
}
