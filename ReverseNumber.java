package com.company;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1424937;
        int newNum = 0;
        while(n > 0){
            int rem = n % 10;
            newNum = newNum * 10 + rem;
            n = n/10;
        }
        System.out.println(newNum);
    }
}
