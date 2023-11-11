package com.company.CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DissapearedNums {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(disNums(nums));
    }
    static List<Integer> disNums(int[] nums){
        int i = 0;
        List<Integer> missingNums = new ArrayList<Integer>();
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(correctIndex != nums[i] && nums[correctIndex]!=nums[i]){
                swap(nums, i, correctIndex);
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for(int j = 0; j<=nums.length-1;j++){
            if(nums[j] != j+1){
                missingNums.add(j+1);
            }
        }
        return missingNums;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
