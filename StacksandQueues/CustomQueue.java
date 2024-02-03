package com.company.StacksandQueues;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data = new int[size];
    }
    public boolean isFull() {
        return end == data.length;
    }
    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int element){
        if(isFull()){
            return false;
        }
        data[end++] = element;
        return true;
    }

    public boolean remove(){
        if(isEmpty()){
            return false;
        }
        int pointer = 0;
        while(pointer!=end){
            data[pointer] = data[pointer+1];
            pointer++;
        }
        end--;
        return true;
    }
    public int front(){
        if(isEmpty()){
            return -1;
        }
        return data[0];
    }
    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }
}
