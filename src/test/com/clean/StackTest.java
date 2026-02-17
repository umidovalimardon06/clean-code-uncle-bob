package com.clean;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StackTest {

    private Stack stack;

    @Before
    public void setUp() throws Exception {
        stack = new Stack();
    }

    @Test
    public void newStack_isEmpty() throws Exception {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void afterOnePush_isNotEmpty() throws Exception {
        stack.push(0);
        assertFalse(stack.isEmpty());
    }

    @Test(expected = Stack.Underflow.class)
    public void willThrowFlow_WhenEmptyStackIsPopped() throws Exception {
        stack.pop();
    }

    @Test
    public void afterOnePushAndPop_WillBeEmpty() throws Exception {
        stack.push(0);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void afterTwoPushAndOnePop_WillNotBeEmpty() throws  Exception {
        stack.push(0);
        stack.push(0);
        stack.pop();
        assertFalse(stack.isEmpty());
    }
}
