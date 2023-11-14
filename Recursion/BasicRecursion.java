package com.company.Recursion;

public class BasicRecursion {
    public static void main(String[] args) {
        // suppose we want to print 1-5 using functions without repeating

        //we can do something like this
        System.out.println("Without recursion : ");
        print1(1);

        //we can see the body of all these function is almost exactly the same hence the functions can be modified into one function
        System.out.println("\nUsing recursion: ");
        print(1);
    }
    static void print(int n){
        System.out.print(n+" ");
        if(n<5){
            print(n+1);
        }else {
            return;
        }
    }
    static void print1(int n){
        System.out.print(n+" ");
        print2(2);
    }
    static void print2(int n){
        System.out.print(n+" ");
        print3(3);
    }
    static void print3(int n){
        System.out.print(n+" ");
        print4(4);
    }
    static void print4(int n){
        System.out.print(n+" ");
        print5(5);
    }
    static void print5(int n){
        System.out.print(n+" ");
    }

}
