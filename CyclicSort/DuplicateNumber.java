package com.company.CyclicSort;

import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int duplicate = findDuplicate(arr);
        System.out.println(duplicate);
    }
    static int findDuplicate(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(correctIndex != nums[i] && correctIndex != nums.length-1 && nums[correctIndex]!=nums[i]){
                swap(nums, i, correctIndex);

            } else{
                i++;
            }
            System.out.println(Arrays.toString(nums));
        }
        return nums[nums.length-1];
    }
//    static int findDuplicate(int[] nums){
//
//    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
