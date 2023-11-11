package com.company.InsertionSort;

import java.util.Arrays;

public class InsertionSortAlgo {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr,j-1,j);
                }else {
                    break;
                }
//                System.out.println(Arrays.toString(arr));
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
