public class Factorial2 {
    public static void main(String[] args) {
        int x = fac(5);
    }

    private static int fac(int i) {
        if(i == 0){
            return i;
        }
        return i * fac(i-1);
    }
}
