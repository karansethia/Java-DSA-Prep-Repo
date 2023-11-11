package com.company.CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {

        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> duplicates = allDuplicates(arr);
        System.out.println(duplicates);
    }
    static List<Integer> allDuplicates(int[] nums){
        List<Integer> duplicates= new ArrayList<Integer>();
        int i = 0;
        while(i< nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex] && correctIndex != nums[i]){
                swap(nums, correctIndex, i);
            }else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                duplicates.add(nums[j]);
            }
        }
        return duplicates;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
