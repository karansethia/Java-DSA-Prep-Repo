package com.company;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	// Program for prime number ( least amount of steps for answer or most suitable method)
        int num = 7;
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
