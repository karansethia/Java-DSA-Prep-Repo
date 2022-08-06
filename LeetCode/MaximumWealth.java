package com.company.LeetCode;
// Ques Link : https://leetcode.com/problems/richest-customer-wealth/
import java.util.Arrays;

public class MaximumWealth {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = new int[3];
        int[][] accounts = {{1,2,3},{2,3,4},{2,3,10}};
        for (int row = 0; row < accounts.length; row++) {
            for (int col = 0; col < accounts[row].length; col++) {
                sum += accounts[row][col];
                arr[row] = sum;
            }
            sum = 0;

        }
        int maximum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maximum){
                maximum = arr[i];
            }
        }
        System.out.println(maximum);
    }
}
