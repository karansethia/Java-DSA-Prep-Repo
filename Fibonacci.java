package com.company;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 7;
        int count = 2;
        while(count <= n){
          int temp = b;
          b = b+a;
          a = temp;
          count++;
        }
        System.out.println(b);
    }
}
