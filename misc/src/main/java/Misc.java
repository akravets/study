public class Misc {
    public static void main(String[] args) {
//        int n = 6;
//
//        boolean b = ((n & 1) == 0) ? false : true;
//
//        int x = 1;
//        int y = 2;
//
//        x ^= y;
//        y ^= x;
//        x ^= y;
//
//        System.out.println(x + "," + y);

        String s = "123456";

        String[] split = s.split("");

        System.out.println("len: " + split.length);

        for(int i = 0; i <  s.length(); i++){
            System.out.println("index: " + i + ", value: " + split[i]);
        }
    }
}
