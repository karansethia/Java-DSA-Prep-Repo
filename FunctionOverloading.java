package com.company;

public class FunctionOverloading {
    public static void main(String[] args) {
        myFunc(24);
        myFunc(8,24);
        myFunc("Karan");
    }
    static void myFunc(int a){
        System.out.println(a);
    }
    static void myFunc(int a,int b){
        System.out.println(a+" "+b);
    }
    static void myFunc(String name){
        System.out.println(name);
    }
}
