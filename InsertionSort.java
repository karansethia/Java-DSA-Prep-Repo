package com.company;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {6,3,8,1,4};
        InsertionAlgo(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void InsertionAlgo(int[] arr){
        // Running outer loop till (N-2)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
