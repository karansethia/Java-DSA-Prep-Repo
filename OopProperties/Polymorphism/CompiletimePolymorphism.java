package com.company.OopProperties.Polymorphism;

public class CompiletimePolymorphism {
    public static void main(String[] args) {

    }

    // order of type should be different
    void sum(int a, String b){}
    void sum(String b, int a){}

    // number of parameters should be different
    int sum(int a, int b){
        return a+b;
    }
    int sum(int b, int a, int c){
        return a+b+c;
    }
}

