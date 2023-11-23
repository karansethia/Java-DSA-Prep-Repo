package com.company.Recursion;

public class Factorial {
    public static void main(String[] args) {
        long ans = factorialOfN(20);
        System.out.println(ans);
    }
    static long factorialOfN(int n){
        if(n<1){  //base case
            return 1;
        }else {
            return n*factorialOfN(n-1);
        }
    }
}
