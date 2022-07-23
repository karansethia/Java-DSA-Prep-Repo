package com.company;

import java.util.Scanner;

public class SwapFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Value : ");
        int v1 = sc.nextInt();
        System.out.println("Enter Second Value : ");
        int v2 = sc.nextInt();
        Swap(v1,v2);
    }
    static void Swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("first value = "+a+"\nSecond Value = "+b);
    }
}
