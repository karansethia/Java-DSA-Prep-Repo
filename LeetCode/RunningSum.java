package com.company.LeetCode;
// Ques Link : https://leetcode.com/problems/running-sum-of-1d-array/
import java.util.Arrays;
import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        int n  =0;
        int[] nums = {1,2,3,4};
        int size = nums.length;
        for (int i = 0, j = 0; i < size && j < size; i++,j++) {
            n += nums[j];
            nums[i] = n;
        }
        System.out.println(Arrays.toString(nums));
    }
}
