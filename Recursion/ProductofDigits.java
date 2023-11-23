package com.company.Recursion;

public class ProductofDigits {
    public static void main(String[] args) {
        System.out.println(prod(123));
    }
    static int prod(int n){
        if(n%10 == n){  // since 4/10 = 4 => we return just 4
            return n;
        }
        return (n%10)*prod(n/10);
    }
}
