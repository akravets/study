import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStackTest {
    MyStack<Integer> myStack;

    @BeforeEach
    void init(){
        myStack = new MyStack<>();
    }
    @Test
    void push(){
        myStack.push(new Integer(1));
        assertEquals(myStack.size(), 1);
    }

    @Test
    void pop(){
        myStack.push(new Integer(1));
        Integer pop = myStack.pop();
        assertEquals(pop, 1);
        assertEquals(myStack.size(),0);
    }

    @Test
    void peek(){
        myStack.push(new Integer(1));
        Integer pop = myStack.peek();
        assertEquals(pop, 1);
        assertEquals(myStack.size(),1);
    }
}
