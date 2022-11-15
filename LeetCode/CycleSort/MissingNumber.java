package com.company.LeetCode.CycleSort;
// QuesLink : https://leetcode.com/problems/missing-number/
import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println("this should work");
        int[] arr = {3,0,1};
        missingNum(arr);
        System.out.println(missingNum(arr));

    }
    static int missingNum(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] ;   // index = value
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
