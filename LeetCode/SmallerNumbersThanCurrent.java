package com.company.LeetCode;
// Ques Link : https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

import java.util.Arrays;
import java.util.Collections;

public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] arr = nums.clone();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(nums));
        //int found = Arrays.binarySearch(arr,8);
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            nums[i] = search(arr,current);
        }
        System.out.println(Arrays.toString(nums));
    }
    static int search(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

}
