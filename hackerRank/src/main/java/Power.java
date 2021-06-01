public class Power {
    public static void main(String[] args) {
        double pow = pow(2, 3);
        System.out.println(pow);
    }


    public static double pow(double x, int n) {
        if(n == 0) {
            return 1;
        }
        System.out.println("base:" + x + ", power: " + n + ", call: " + pow(x, n-1));
        return x * pow(x, n-1);
    }
}
