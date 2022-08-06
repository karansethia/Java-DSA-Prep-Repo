package com.company;

public class MInNumber {
    public static void main(String[] args) {
        int[] arr = {20,1,4,3,21,-5,24,-8};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int minimum = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minimum){
                minimum = arr[i];
            }
        }
        return minimum;
    }
}
