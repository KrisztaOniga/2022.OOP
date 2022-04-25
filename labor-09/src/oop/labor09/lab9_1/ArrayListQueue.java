package oop.labor09.lab9_1;

import java.util.Objects;
import java.util.ArrayList;

public class ArrayListQueue implements IQueue {

    private ArrayList<Object> items = new ArrayList<>();
    private final int CAPACITY;

    public ArrayListQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
    }

    @Override
    public boolean isEmpty() {
        return items.size() == 0;
    }

    @Override
    public boolean isFull() {
        return items.size() == CAPACITY;
    }

    @Override
    public void enQueue(Object newObject) {
        if(!isFull()) {
            items.add(newObject);
        }
    }

    @Override
    public Object deQueue() {
        if(!isEmpty()){
            Object object = items.get(0);
            items.remove(0);
            return object;
        }
        return null;
    }

    @Override
    public void printQueue() {
        for(Object object : items){
            System.out.println(object);
        }
    }

    @Override
    public boolean equals(Object o){
        if(this == o) {
            return true;//ha a referencia ugyanaz
        }
        if(o == null || getClass() != o.getClass())
            return false;
        ArrayListQueue that = (ArrayListQueue) o;
        if(this.items.size() != that.items.size())
            return false;
        for (int i = 0; i < items.size(); i++) {
            if(!this.items.get(i).equals(that.items.get(i)))
                return false;
        }
        return true;
    }

    @Override
    public  int hashCode(){
        return Objects.hash(items);
    }
}
