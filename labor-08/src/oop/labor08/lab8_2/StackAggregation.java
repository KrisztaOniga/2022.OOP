package oop.labor08.lab8_2;

import java.util.ArrayList;

public class StackAggregation {
    private ArrayList<Object> items = new ArrayList<>();
    private int capacity;

    public StackAggregation(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFull(){
        return items.size() == capacity;
    }

    public boolean isEmpty(){
        return items.size() == 0;
    }

    public void push(Object object){
        if(!isFull())
            items.add(object);
    }

    public void pop(){
        if(!isEmpty())
            items.remove(items.size() - 1);
    }

    public Object top(){
        if(!isEmpty())
            return items.get(items.size() - 1);
        return null;
    }

    public int getSize(){
        return items.size();
    }
}
