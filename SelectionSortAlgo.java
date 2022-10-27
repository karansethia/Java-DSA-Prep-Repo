package com.company;

import java.util.Arrays;

public class SelectionSortAlgo {
    public static void main(String[] args) {
    int[] arr = {2,1,4,5,3};
    selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1; // the element till the loop must run
            //step 1 : find the max element
            int maxElement = getMax(arr,0, last);
            // swap the max element to the element at its correct index
            swap(arr, maxElement, last);
            
        }
    }

    private static int getMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;

    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
//    static void selection(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            // find the max item in the remaining array and swap with correct index
//            int last = arr.length - i - 1;
//            int maxIndex = getMaxIndex(arr, 0, last);
//            swap(arr, maxIndex, last);
//        }
//    }
//
//    static int getMaxIndex(int[] arr, int start, int end) {
//        int max = start;
//        for (int i = start; i <= end; i++) {
//            if (arr[max] < arr[i]) {
//                max = i;
//            }
//        }
//        return max;
//    }
}
