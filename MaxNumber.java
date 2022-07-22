package com.company;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        int max = a;
//        if(b>max)
//            max = b;
//        if (c>max)
//            max = c;
        int max = Math.max(a,Math.max(b,c));

        System.out.println(max);
    }
}
