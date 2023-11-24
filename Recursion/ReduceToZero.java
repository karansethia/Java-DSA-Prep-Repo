package com.company.Recursion;

public class ReduceToZero {
    public static int count = 0;
    static void reducer(int num){
        if(num == 0){
            return;
        }
        if(num%2==0){
            reducer(num/2);
            count++;
        }else{
            reducer(num-1);
            count++;
        }

    }
    public static void main(String[] args) {
//        if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
        reducer(8);
        System.out.println(count);
    }
}
