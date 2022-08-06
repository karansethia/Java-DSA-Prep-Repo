package com.company.LeetCode;
// Ques Link : // Ques Link : https://leetcode.com/problems/build-array-from-permutation/
import java.util.Arrays;
import java.util.Scanner;

public class ArrayFromPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[6];
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i <= nums.length-1; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i <= n-1; i++) {
            ans[i] = nums[nums[i]];
        }
        System.out.println(Arrays.toString(ans));
    }
}
