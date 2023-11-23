package com.company.Recursion;

public class NtoOne {
    public static void main(String[] args) {
        printNum(5);
    }
    static void printNum(int n){
        System.out.println(n);
        if(n>1){
            printNum(n-1);
        }
        System.out.println(n);
    }
}
