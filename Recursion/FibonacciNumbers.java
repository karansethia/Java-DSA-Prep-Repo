package com.company.Recursion;

public class FibonacciNumbers {
    public static void main(String[] args) {
        fiboseries(0,1);
        System.out.println("\n" + fiboNum(5));
    }
    static void fiboseries(int a, int b){
        if(a == 0){
            System.out.print(a+", "+b+", ");
        }else{
            System.out.print(b+", ");
        }

        if(b<80){
            fiboseries(b,b+a);
        }else {
            return;
        }
    }
    static int fiboNum(int n){
        if(n < 2) {
            return n;
        }
        return fiboNum(n-1) + fiboNum(n-2);

    }
}
