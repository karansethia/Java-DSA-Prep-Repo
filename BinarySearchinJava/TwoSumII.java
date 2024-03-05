package com.company.BinarySearchinJava;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
//        int[] numbers = {2,7,11,15};
        int[] numbers = {2,3,4};
        int[] ans = twoSum(numbers, 6);
        System.out.println(Arrays.toString(ans));
    }
    static int[] twoSum(int[] numbers, int target) {
        int[] arr = {-1,-1};
        int start = 0;
        int end = numbers.length - 1;
        while(start <= end){
            if(numbers[start]+numbers[end] > target){
                end--;
            }
            else if(numbers[start]+numbers[end] < target){
                start++;
            }else{
                arr[0] = start+1;
                arr[1] = end+1;

                return arr;
            }
        }
        return arr;
    }
}
