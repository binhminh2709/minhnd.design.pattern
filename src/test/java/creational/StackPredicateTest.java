package creational;

import org.junit.Before;
import org.junit.Test;
import other.stack.Stack;
import other.stack.StackPredicate;

import static org.junit.Assert.assertEquals;

public class StackPredicateTest {
    
    private Stack stack;
    
    @Before
    public void createStack() {
        stack = new Stack();
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }
    }
    
    @Test
    public void evenPredicate() {
        final Stack filtered = stack.filter(new StackPredicate() {
            @Override
            public boolean isValid(int i) {
                //phép toán logic, and 1, để kiểm tra chẵn lẻ
                return (i & 1) == 0;
            }
        });
        
        assertEquals(Integer.valueOf(10), filtered.pop());
        assertEquals(Integer.valueOf(8), filtered.pop());
        assertEquals(Integer.valueOf(6), filtered.pop());
    }
    
    @Test
    public void allPredicate() {
        final Stack filtered = stack.filter(new StackPredicate() {
            @Override
            public boolean isValid(int i) {
                return true;
            }
        });
        
        assertEquals(Integer.valueOf(10), filtered.pop());
        assertEquals(Integer.valueOf(9), filtered.pop());
        assertEquals(Integer.valueOf(8), filtered.pop());
    }
}
