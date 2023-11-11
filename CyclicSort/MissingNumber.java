package com.company.CyclicSort;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,1};
//        findMissing(arr);
        int missingNum = findMissing(arr);
        System.out.println(missingNum);
    }
//    static int findMissing(int[] arr){
//        int len = arr.length+1;
//        int[] nums = new int[len];
//        for (int i = 0; i < nums.length-1; i++) {
//            int correctIndex = arr[i];
//            nums[correctIndex] = arr[i];
//      }
//        System.out.println(Arrays.toString(nums));
//        for (int i = 1; i <= nums.length-1; i++) {
//            if(nums[i] == 0){
//                return i;
//            }
//        }
//        return -1;
//    }
    static int findMissing(int[] arr){
        int i = 0;
        while(i< arr.length){
            int correctIndex = arr[i];
            if(arr[correctIndex] != arr[i] && correctIndex != arr.length-1){
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }
        for (int j = 0; j < arr.length-1; j++) {
            if(arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
