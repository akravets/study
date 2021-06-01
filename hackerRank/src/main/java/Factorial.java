public class Factorial {
    public static void main(String[] args) {
        int x = factorial(3);
        System.out.println(x);
    }

    private static int factorial(int f){
        if (f == 0) {
            return 1;
        }
        return f * factorial(f-1);
    }
}
