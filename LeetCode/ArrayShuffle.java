package com.company.LeetCode;
//Ques Link : https://leetcode.com/problems/shuffle-the-array/

import java.util.Arrays;

public class ArrayShuffle{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int n = nums.length/2;
        int[] arr = new int[2*n];
        for (int i = 0; i < 2*n; i+=2) {
            arr[i] = nums[i/2];
            arr[i+1] = nums[(i/2)+n];
            }
        System.out.println(Arrays.toString(arr));
        }

    }

