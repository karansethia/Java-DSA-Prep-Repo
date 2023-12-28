package com.company.AbstractClass;

public class ChildTwo extends Parent{
    public ChildTwo(int age) {
        super(age);
    }

    @Override
    void fun1() {
        System.out.println("Hi my name is Kunal from Child 2");
    }

    @Override
    void fun2() {
        System.out.println("I'm going to be an actor when Im "+ this.age);
    }

}
