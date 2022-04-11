package oop.labor09.lab9_1;

public interface IQueue {
    public boolean isEmpty();
    public boolean isFull();
    public void enQueue(Object object);
    public Object deQueue();
    public void printQueue();

}
