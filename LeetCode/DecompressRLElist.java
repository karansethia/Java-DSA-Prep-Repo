package com.company.LeetCode;
// Ques Link : https://leetcode.com/problems/decompress-run-length-encoded-list/

import java.util.ArrayList;
import java.util.Arrays;

public class DecompressRLElist {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i+=2) {
            for (int j = 1; j <= nums[i]; j++) {
                arr.add(nums[i+1]);
            }
        }
        int[] newarr = new int[arr.size()];
        for(int i = 0;i < newarr.length;i++){
            newarr[i] = arr.get(i);
        }
        System.out.println(Arrays.toString(newarr));

    }
}
