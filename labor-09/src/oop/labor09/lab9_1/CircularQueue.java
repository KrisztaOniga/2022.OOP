package oop.labor09.lab9_1;

import oop.labor09.lab9_1.IQueue;

import java.util.Objects;

public class CircularQueue implements IQueue {

    private final int CAPACITY;
    private Object[] items;
    private int front;
    private int rear;

    public CircularQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        this.items = new Object[CAPACITY];
        front = -1;
        rear = -1;
    }

    @Override
    public boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if (front == 0 && rear == items.length - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }

    @Override
    public void enQueue(Object newObject) {
        if (!isFull()) {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % items.length;
            items[rear] = newObject;
            System.out.println("Inserted: " + newObject);
        }
    }

    @Override
    public Object deQueue() {
        Object element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = items[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } /* Q has only one element, so we reset the queue after deleting it. */ else {
                front = (front + 1) % items.length;
            }
            return (element);
        }
    }

    @Override
    public void printQueue() {
        /* Function to display status of Circular Queue */
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("Front -> " + front);
            System.out.println("Items -> ");
            for (i = front; i != rear; i = (i + 1) % items.length)
                System.out.print(items[i] + " ");
            System.out.println(items[i]);
            System.out.println("Rear -> " + rear);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;//ha a referencia ugyanaz
        }
        CircularQueue that = (CircularQueue) o;
        if (this.items.length != that.items.length)
            return false;
        if (this.CAPACITY != that.CAPACITY)
            return false;
        return Objects.equals(items, that.items);
    }
}
