import java.util.Scanner;
import java.util.Stack;

public class Postfix {
    public static void main(String[] args) {
        String s = "2 3 + -";
        int i = evalPostfix(s);
        System.out.println(i);
    }

    private static int evalPostfix(String s){
        Scanner scanner = new Scanner(s);
        Stack<Integer> stack = new Stack<>();

        while (scanner.hasNext()){
            if(scanner.hasNextInt()){
                stack.push(scanner.nextInt());
                continue;
            }
            if(stack.size() != 2){
                throw new IllegalStateException("Found operand, but stack size is not as expected");
            }
            int n1 = stack.pop();
            int n2 = stack.pop();

            char operand = scanner.next().charAt(0);

            if(operand == '+') stack.push(n1 + n2);
            if(operand == '-') stack.push(n1 - n2);
            if(operand == '/') stack.push(n1 / n2);
            if(operand == '*') stack.push(n1 * n2);
        }
        scanner.close();

        return stack.pop();
    }
}
