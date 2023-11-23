package com.company.Recursion;

public class CountZeros {
    public static int count = 0;
    static void count(int n){
        if(n%10 == 0){
            count++;
        }
        if(n%10 == n){
            return;
        }
        count(n/10);
    }
    public static void main(String[] args) {
        count(12300206);
        System.out.println(count);
    }
}
