package com.company;

public class ThreeDigitArmstrong {
    public static void main(String[] args) {
        for(int i=100; i<=999; i++){
            isArmstrong(i);
        }
    }
    static void isArmstrong(int num){
        int pnum = num;
        int newSum = 0;
        while(pnum>0){
            int rem = pnum % 10;
            newSum = newSum + rem*rem*rem;
            pnum = pnum/10;
        }
        if(newSum == num) {
            System.out.println(num);
        }
    }
}
