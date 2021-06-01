public class Generix {
    interface MyGen<OUTPUT extends String>{
        public <INPUT extends Number> OUTPUT doit(INPUT input);
    }

    public static void main(String[] args) {
        MyGen gen = new MyGenImpl();
        System.out.println(gen.doit(1.12).length());
    }

    static class MyGenImpl implements MyGen{


        @Override
        public String doit(Number input) {
            return String.valueOf(input);
        }
    }
}
