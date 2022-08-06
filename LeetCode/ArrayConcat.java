package com.company.LeetCode;
// Ques Link : https://leetcode.com/problems/concatenation-of-array/
import java.util.Arrays;

public class ArrayConcat {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int n = arr.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = arr[i];
        }
        for (int j = 0; j < n ; j++) {
            ans[j+n] = arr[j];
        }
        System.out.println(Arrays.toString(ans));
    }
}
