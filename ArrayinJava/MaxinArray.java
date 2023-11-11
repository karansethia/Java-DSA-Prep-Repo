package com.company.ArrayinJava;

import java.util.Arrays;

public class MaxinArray {
    public static void main(String[] args) {
        int[] arr = {23,12,45,24,54,14,26,72,32,41};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
