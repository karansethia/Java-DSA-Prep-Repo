package com.company.Recursion;

import java.util.Arrays;

public class SelectionSortwithRecursion {
    public static void main(String[] args) {
        int[] arr = {21,2,6,22,17};
        sort(arr, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int last){
        if(last == 0){
            return;
        }
        int max = getMax(arr,0,last);
        swap(arr,max,last);
        sort(arr,last-1);

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
