package com.company.ArrayinJava;

import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,6,12,53};
        swap(arr,2,4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
