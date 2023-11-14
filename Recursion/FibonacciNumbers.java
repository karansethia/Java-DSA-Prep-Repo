package com.company.Recursion;

public class FibonacciNumbers {
    public static void main(String[] args) {
        fiboseries(0,1);
    }
    static void fiboseries(int a, int b){
        if(a == 0){
            System.out.print(a+", "+b+", ");
        }else{
            System.out.print(b+", ");
        }

        if(b<50){
            fiboseries(b,b+a);
        }else{
            return;
        }
    }
}
