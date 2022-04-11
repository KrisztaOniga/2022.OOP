package oop.labor09.lab9_1;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class ArrayListQueue implements IQueue {
    private ArrayList<Object> items;
    private final int CAPACITY;

    public ArrayListQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
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
