package com.company;

import java.util.Scanner;

public class ArmstrongMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        isArmstrong(num);
    }
    static void isArmstrong(int num){
        int pnum = num;
        int newSum = 0;
        while(pnum>0){
            int rem = pnum % 10;
            newSum = newSum + rem*rem*rem;
            pnum = pnum/10;
        }
        if(newSum == num){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not");
        }
    }
}
