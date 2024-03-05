package com.company.StacksandQueues;

public class CustomCircularQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int size=0;
    protected int front = 0;
    protected int end = 0;

    public CustomCircularQueue() {
        this(DEFAULT_SIZE);
    }
    public CustomCircularQueue(int size){
        this.data = new int[size];
    }
    public boolean isFull() {
        return size == data.length;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int element){
        System.out.println(element);
        data[end++] = element;
        end = end % data.length;
        size++;
        return true;
    }
    public int remove(){
        if(isEmpty()){
            return -1;
        }
        int removed = data[front++];
       front = front % data.length;
       size--;
       return removed;
    }
    public int front(){
        if(isEmpty()){
            return -1;
        }
        return data[0];
    }
    public void display() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }
}
