package com.company.AbstractClass;

public class Child extends Parent{

    public Child(int age) {
        super(age);
    }

    @Override
    void fun1() {
        System.out.println("Hi my name is Karan from Child 1");
    }

    @Override
    void fun2() {
        System.out.println("I want to be a engineer when Im " + this.age);
    }
}
