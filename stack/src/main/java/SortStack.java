import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(2);
        stack.push(0);

        Stack<Integer> stack1 = sortStack(stack);
        System.out.println();
    }

    private static Stack<Integer> sortStack(Stack<Integer> stack) {
      Stack<Integer> tempStack = new Stack<>();

      while (!stack.isEmpty()) {
          Integer temp = stack.pop();

          while(!tempStack.isEmpty() && tempStack.peek() > temp){
              stack.push(tempStack.pop());
          }
          tempStack.push(temp);
      }
      return tempStack;
    }
}
