package com.company.StacksandQueues;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int pointer = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }
    public boolean add(int element){
        if(isFull()){
            return false;
        }
        pointer++;
        data[pointer] = element;
        return true;
    }
    public int remove() throws StackException{
        if(isEmpty()){
            throw new StackException("Stack is empty");
        }
       int removedElement = data[pointer];
        pointer--;
        return removedElement;
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Stack is empty");
        }
        return data[pointer];
    }

    public boolean isFull() {
        return pointer == data.length-1;
    }
    public boolean isEmpty() {
        return pointer == -1;
    }
}
