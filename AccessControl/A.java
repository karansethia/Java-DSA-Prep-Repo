package com.company.AccessControl;

public class A {
    private int id;
    String name;
    int[] arr;

    // since the id variable is private we change or access the value using getter and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public A(int id, String name, int[] arr) {
        this.id = id;
        this.name = name;
        this.arr = arr;
    }
}
