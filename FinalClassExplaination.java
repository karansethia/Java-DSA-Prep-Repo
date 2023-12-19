package com.company;

public class FinalClassExplaination {
    public static void main(String[] args) {
        // integers declared with int are pass by value in nature so swapping them in a different function will not affect
        // the reference variable hence and b will yield the same value
        Integer a = 10;
        Integer b = 20;
        // In this case even if we are using Integer wrapper class, the refernces still wont swap values becuase of
        // final keyword used while declaring Integer wrapper class by Java devs (public "final" class Integer extends Number)
        swap(a,b);
        System.out.println("a: "+a+" \nb: "+b);
        final int VALUE = 24;
//        VALUE = 23; //error - Cannot assign a value to final variable 'someValue'
    }
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
