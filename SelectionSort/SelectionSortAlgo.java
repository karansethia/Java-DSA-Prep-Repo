package com.company.SelectionSort;

import java.util.Arrays;

public class SelectionSortAlgo {
    public static void main(String[] args) {
        int[] arr = {3,5,1,2,4};
//        int[] arr = {1,2,3,4,5};
        selectSort(arr);
        System.out.println("Final Ans: "+ Arrays.toString(arr));
    }
    static void selectSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i -1;
            int max = getMax(arr, 0, last);
            swap(arr,max, last);
        }
    }
    static int getMax(int[] arr,int start,int end){
        int max = start;
        for (int i = 0; i <= end; i++) {
            if(arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
