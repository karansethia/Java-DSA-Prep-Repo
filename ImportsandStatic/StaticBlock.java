package com.company.ImportsandStatic;

public class StaticBlock {
    static int a = 4;
    static int b;

    // will only run once when first object is created iee class is loaded for the first time
    static {
        System.out.println("Inside static block");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock(); // => this is where static block gets loaded
        System.out.println(StaticBlock.a);
        System.out.println(StaticBlock.b);
        StaticBlock.b += 4;
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.b);


    }
}
