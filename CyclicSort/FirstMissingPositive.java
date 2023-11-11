package com.company.CyclicSort;

import java.sql.Array;
import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
//        int max = findMax(arr);
//        int missingNum = firstMissing(arr, max);
//        System.out.println(missingNum);
        int missingPositive = findMissingCycle(arr);
        System.out.println(missingPositive);

    }

    static int findMissingCycle(int[] nums){
        int i = 0;
        while(i< nums.length){
            int correctIndex = nums[i] - 1;
            if(correctIndex != i && nums[i] > 0){
                swap(nums, i, correctIndex);
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return nums.length+1;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

//    Another Correct Approach but will consume more memory
    static int firstMissing(int[] nums, int max){
        int[] ans = new int[max];
        System.out.println(Arrays.toString(ans));
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                ans[nums[i] - 1] = nums[i];
            }
        }
        System.out.println(Arrays.toString(ans));
        for (int j = 0; j < ans.length; j++) {
            if(ans[j] == 0){
                return j+1;
            }
        }
        return ans.length+1;
    }
    static int findMax(int[] nums){
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }
}
