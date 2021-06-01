import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

public class Leet20 {
    public static void main(String[] args) {
        //String s = "()";
        String s = "()()()()";
        //String s = "(((((((()";
        //String s = "(])";
        isValid(s);
    }

    private static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        Stack<Character> stack = new Stack<>();

        char[] chars = s.toCharArray();

        for(Character c : chars){
            Character character = map.get(c);

            // opening bracket
            if(character != null){
                stack.push(c);
            }
            else{
                if(!stack.isEmpty()) {
                    if(c == map.get(stack.peek())){
                        stack.pop();
                    }
                    else {
                       return false;
                    }
                }
                else{
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }
}
