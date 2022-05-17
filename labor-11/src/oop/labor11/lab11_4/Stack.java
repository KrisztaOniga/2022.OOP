package oop.labor11.lab11_4;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Object> items = new ArrayList<>();
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFull(){
        return items.size() == capacity;
    }

    public boolean isEmpty(){
        return items.size() == 0;
    }

    public void push(Object object) throws ExpressionException{
        if(!isFull())
            items.add(object);
        else {
            throw new ExpressionException("STACK IS FULL");
        }
    }

    public Object pop() throws ExpressionException{
        if(!isEmpty()){
            Object temp = items.get(items.size() - 1);
            items.remove(items.size() - 1);
            return temp;
        }
        else {
            throw new ExpressionException("STACK IS EMPTY");
        }
    }

    public Object top() throws ExpressionException {
        if(!isEmpty())
            return items.get(items.size() - 1);
        else {
            throw new ExpressionException("STACK IS EMPTY");
        }
    }

    public int getSize(){
        return items.size();
    }
}
