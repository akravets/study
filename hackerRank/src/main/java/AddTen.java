public class AddTen {
    public static void main(String[] args) {
        int x  = add(10);
        System.out.println(x);
    }

    private static int add(int i) {
        if(i == 5){
            return i;
        }
        return i + add(i-1);
    }
}
