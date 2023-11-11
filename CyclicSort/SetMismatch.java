package com.company.CyclicSort;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int[] nums = mismatches(arr);
        System.out.println(Arrays.toString(nums));
    }
    static int[] mismatches(int[] nums){
        int i = 0;
        int[] ans = {-1,-1};
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(correct != i && nums[correct] != nums[i]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        for(int j = 0;j<nums.length; j++){
            if(nums[j] != j+1){
                ans[0] = nums[j];
                ans[1] = j+1;
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
