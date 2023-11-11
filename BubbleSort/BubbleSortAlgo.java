package com.company.BubbleSort;

import java.util.Arrays;

public class BubbleSortAlgo {
    public static void main(String[] args) {
//        int[] arr = {3,5,1,2,4};
        int[] arr = {1,2,3,4,5};
        bubbleSort(arr);
        System.out.println("Final Ans: "+Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        boolean swap;
        for (int j = 0; j < arr.length; j++) {
            swap = false;
        for (int i = 1; i < arr.length-j; i++) {
         if(arr[i] < arr[i-1]){
             int temp = arr[i];
             arr[i] = arr[i-1];
             arr[i-1] = temp;
             swap = true;
         }
        }
        if(!swap){
            break;
        }
            System.out.println(j+"th Pass: "+Arrays.toString(arr));
        }

    }
}
