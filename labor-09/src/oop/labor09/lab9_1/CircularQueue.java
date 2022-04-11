package oop.labor09.lab9_1;

import oop.labor09.lab9_1.IQueue;

public class CircularQueue implements IQueue {

    private final int CAPACITY;
    private Object[] items;
    private int front;
    private int rear;

    public CircularQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        this.items = new Object[CAPACITY];
        front = 0;
        rear = 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void enQueue(Object object) {

    }

    @Override
    public Object deQueue() {
        return null;
    }

    @Override
    public void printQueue() {

    }
}
