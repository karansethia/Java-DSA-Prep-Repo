package com.company;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {5,1,4,3,2};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void bubbleSort(int[] arr){
        boolean swap;     // variable to check if the array is already sorted
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swap = false;
            // for each step, the max item will be placed at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                //swap if the item is smaller than the prev item
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true;
                }
            }
            if(!swap) {
                break;
            }
        }
    }
}
