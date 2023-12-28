package com.company.AbstractClass;

public class Main {
    public static void main(String[] args) {
        Child karan = new Child(24);
        karan.fun1();
        karan.fun2();
        ChildTwo Kunal = new ChildTwo(21);
        Kunal.fun1();
        Kunal.fun2();

//        Parent mom = new Parent();  Can't create objects of an abstract class

    }
}
