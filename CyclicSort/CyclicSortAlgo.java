package com.company.CyclicSort;

import java.util.Arrays;

public class CyclicSortAlgo {
    public static void main(String[] args) {
        int[] arr = {5,3,4,2,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr){
        int i = 0;
        while(i< arr.length){
            int correctIndex = arr[i] - 1; //correct index of the value in arr[i]
            if(correctIndex != i){
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
