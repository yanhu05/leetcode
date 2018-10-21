package main.design;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumFrequencyStackTest {

    @Test
    void pop() {
        MaximumFrequencyStack stack = new MaximumFrequencyStack();
        stack.push(5);
        stack.push(7);
        stack.push(5);
        stack.push(7);
        stack.push(4);
        stack.push(5);
        assertEquals(5, stack.pop());
        assertEquals(7, stack.pop());
        assertEquals(5, stack.pop());
        assertEquals(4, stack.pop());
    }

}