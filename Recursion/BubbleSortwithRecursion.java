package com.company.Recursion;

import java.util.Arrays;

public class BubbleSortwithRecursion {
    public static void main(String[] args) {
//        int[] arr = {4,2,5,1,3};
        int[] arr = {5,4,3,2,1};
        sort(1,0,arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int index, int pass, int[] arr){
        if(arr[index] < arr[index-1]) {
            swap(arr, index, index - 1);
            if(index < arr.length-1){
            sort(index+1,pass,arr);}
        }
        if(index >= arr.length-1-pass){
            pass++;
            index=0;
        }
        if(arr.length - pass == 0){
            return;
        }
        sort(index+1,pass,arr);
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
