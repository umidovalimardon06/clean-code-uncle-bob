package com.clean;

public class Stack {
    private int size = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int e) {
        size++;
    }

    public int pop() {
        if (isEmpty()) throw new Underflow();
        size--;
        return -1;
    }

    public static class Underflow extends RuntimeException {
    }
}
