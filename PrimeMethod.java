package com.company;

import java.util.Scanner;

public class PrimeMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        isPrime(num);
    }
    static void isPrime(int num){
        boolean flag = false;
        for(int i=2; (i*i)<num; i++){
            if(num % i == 0){
                flag = true;
                break;
            }
        }
        if(flag)
            System.out.println("not prime");
        else
            System.out.println("prime");
    }
}
